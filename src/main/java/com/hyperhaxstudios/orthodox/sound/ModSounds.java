package com.hyperhaxstudios.orthodox.sound;

import com.hyperhaxstudios.orthodox.Orthodox;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;


public class ModSounds {
    public static SoundEvent SPACEDRONE = registerSoundEvent("music_disc");





    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Orthodox.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

}
