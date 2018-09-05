package plugin;

import interfacesdecorator.IPlugin;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import gui.Menu;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Plugin implements IPlugin{
    @Override
    public void initialize() {
        getLoadedPlugin();
    }
    
    public void getLoadedPlugin(){
        File currentDir = new File("./plugins");
        String[] plugins = currentDir.list();
        int i;
        URL[] jars = new URL[plugins.length];
        for (i = 0; i < plugins.length; i++) {
            System.out.println(i + 1 + " - " + plugins[i].split("\\.")[0]);
            try {
                jars[i] = (new File("./plugins/" + plugins[i])).toURL();
            } catch (MalformedURLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        URLClassLoader ulc = new URLClassLoader(jars);
        for (i = 0; i < plugins.length; i++) {
            String factoryName = plugins[i].split("\\.")[0];
            try {
               IPlugin plugin = (IPlugin) Class.forName(factoryName.toLowerCase()+"."+ factoryName, true, ulc).newInstance();
               plugin.initialize();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
