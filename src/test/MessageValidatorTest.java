package test;

import main.java.Kingdoms;
import main.java.MessageValidator;
import org.junit.Assert;
import org.junit.Test;

public class MessageValidatorTest {

    @Test
    public void testCheckMessageValidityToAcquireKingdom () {

        MessageValidator messageValidator = new MessageValidator("AYDSSNJFFJAWWHP", Kingdoms.LAND_EMBLEM.getKingdomEmblem());
        Assert.assertTrue(messageValidator.checkMessageValidityToAcquireKingdom());

        messageValidator = new MessageValidator("FHFTFOMFMFAMF", Kingdoms.ICE_EMBLEM.getKingdomEmblem());
        Assert.assertTrue(messageValidator.checkMessageValidityToAcquireKingdom());

        messageValidator = new MessageValidator("SUMMER IS COMING", Kingdoms.ICE_EMBLEM.getKingdomEmblem());
        Assert.assertFalse(messageValidator.checkMessageValidityToAcquireKingdom());

        messageValidator = new MessageValidator("OWLAOWLBOWLC", Kingdoms.FIRE_EMBLEM.getKingdomEmblem());
        Assert.assertFalse(messageValidator.checkMessageValidityToAcquireKingdom());
    }
}
