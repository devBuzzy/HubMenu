package com.buzzyog.gsquad.files;

import org.bukkit.configuration.file.FileConfiguration;

import java.util.UUID;

public class Config {

    private FileConfiguration conf()
    {
        return FileManager.getConfig();
    }


    //Methods

    public void setCredits(UUID uuid, int credits)
    {
        conf().set(uuid.toString(), credits);
    }

    public int getCredits(UUID uuid)
    {
        if(!conf().isSet(uuid.toString()))conf().set(uuid.toString(), 0);
        return conf().getInt(uuid.toString());
    }

    public void addCredits(UUID uuid, int credits)
    {
        if(!conf().isSet(uuid.toString()))conf().set(uuid.toString(), 0);
        int old = conf().getInt(uuid.toString());
        conf().set(uuid.toString(), old + credits);
    }

    public boolean removeCredits(UUID uuid, int credits)
    {
        if(!conf().isSet(uuid.toString()))conf().set(uuid.toString(), 0);
        int old = conf().getInt(uuid.toString());
        if(old - credits >= 0)
        {
            conf().set(uuid.toString(), old - credits);
            return true;
        }
        return false;
    }
}
