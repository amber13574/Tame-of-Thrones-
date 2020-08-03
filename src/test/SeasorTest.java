package test;

import main.java.Kingdoms;
import main.java.Seasor;
import org.junit.Assert;
import org.junit.Test;

public class SeasorTest {
    @Test
    public void testDecryptMessage() {

        Seasor seasor = new Seasor("FDIXXSOKKOFBBMU", Kingdoms.LAND_EMBLEM.getCipherFactor());
        Assert.assertEquals("AYDSSNJFFJAWWHP", seasor.decryptMessage());

        seasor = new Seasor("MOMAMVTMTMHTM", Kingdoms.ICE_EMBLEM.getCipherFactor());
        Assert.assertEquals("FHFTFOMFMFAMF", seasor.decryptMessage());

        seasor = new Seasor("SUMMER IS COMING", Kingdoms.WATER_EMBLEM.getCipherFactor());
        Assert.assertEquals("LNFFXK BL VHFBGZ", seasor.decryptMessage());

        seasor = new Seasor("OWLAOWLBOWLC", Kingdoms.AIR_EMBLEM.getCipherFactor());
        Assert.assertEquals("LTIXLTIYLTIZ", seasor.decryptMessage());

        seasor = new Seasor("AJXGAMUTA", Kingdoms.FIRE_EMBLEM.getCipherFactor());
        Assert.assertEquals("UDRAUGONU", seasor.decryptMessage());
    }
}
