package plugin;

import gui.ChooseFlavorsPizza;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PluginController {
    private final ArrayList<String> pluginsList = new ArrayList<>();
    private URLClassLoader ulc;
    
    public ArrayList<String> getLoadedPlugins(){
        File currentDir = new File("./plugins");
        String[] plugins = currentDir.list();
        int i;
        
        URL[] jars = new URL[plugins.length];
        for (i = 0; i < plugins.length; i++) {
            try {
                jars[i] = (new File("./plugins/" + plugins[i])).toURI().toURL();
            } catch (MalformedURLException ex) {
                Logger.getLogger(ChooseFlavorsPizza.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         
        ulc = new URLClassLoader(jars);
        for (i = 0; i < plugins.length; i++) {
            String factoryName = plugins[i].split("\\.")[0];
            pluginsList.add(factoryName);
        }
        
        return pluginsList;
    }
    
//    public URLClassLoader getUrlClassLoader(){
//        
//    }
}
