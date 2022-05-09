package com.TigrexDai.tigrexstuff;

import com.TigrexDai.tigrexstuff.proxy.CommonProxy;
import com.TigrexDai.tigrexstuff.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.*;


@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;
}
