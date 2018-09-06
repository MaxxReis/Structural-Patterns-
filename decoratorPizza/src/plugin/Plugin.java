package plugin;

import interfacesdecorator.IPlugin;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import gui.Menu;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Plugin implements IPlugin{
    private ArrayList<String> pluginsList = new ArrayList<>();
    
    @Override
    public void initialize() {
        getLoadedPlugin();
    }
    
    public ArrayList<String> getLoadedPlugin(){
        /*File currentDir = new File("./plugins");
        File[] archives = currentDir.listFiles();
        String[] names = currentDir.list();
        int i = 0;
        URL[] jars = new URL[names.length];
        for (File file : archives) {
            System.out.println(file + " - " + names[i].split("\\.")[0]);
            try {
                jars[i] = (new File("./plugins/" + names[i])).toURI().toURL();
            } catch (Exception ex) {
                Logger.getLogger(Plugin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        URLClassLoader ulc = new URLClassLoader(jars);
        for(i = 0; i < names.length; i++){
            String decoratorName = names[i].split("\\.")[0];
            try {
                IPlugin plugin = (IPlugin) Class.forName(decoratorName.toLowerCase() + "." + decoratorName, true, ulc).newInstance();
                plugin.initialize();
            } catch (Exception ex) {
                Logger.getLogger(Plugin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }*/
        
        String pluginNames = null;
        
        File currentDir = new File("./plugins");
        String[] plugins = currentDir.list();
        int i;
        
        URL[] jars = new URL[plugins.length];
        for (i = 0; i < plugins.length; i++) {
            //System.out.println(i + 1 + " - " + plugins[i].split("\\.")[0]);
            try {
                jars[i] = (new File("./plugins/" + plugins[i])).toURI().toURL();
            } catch (MalformedURLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         
        URLClassLoader ulc = new URLClassLoader(jars);
        for (i = 0; i < plugins.length; i++) {
            String factoryName = plugins[i].split("\\.")[0];
            pluginsList.add(factoryName);
            pluginNames += factoryName;
            
            //System.out.println(pluginsList);
            /*try {
               IPlugin plugin = (IPlugin) Class.forName(factoryName.toLowerCase()+"."+ factoryName, true, ulc).newInstance();
               plugin.initialize();
               //pluginsList.add(plugin);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }
        
        return pluginsList;
    }
}
