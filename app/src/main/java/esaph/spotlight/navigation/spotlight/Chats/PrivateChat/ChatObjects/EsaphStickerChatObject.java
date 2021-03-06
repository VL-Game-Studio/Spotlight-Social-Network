/*
 *  Copyright (C) Esaph, Julian Auguscik - All Rights Reserved
 *  * Unauthorized copying of this file, via any medium is strictly prohibited
 *  * Proprietary and confidential
 *  * Written by Julian Auguscik <esaph.re@gmail.com>, March  2020
 *
 */

package esaph.spotlight.navigation.spotlight.Chats.PrivateChat.ChatObjects;

import esaph.spotlight.Esaph.EsaphSpotLightPhotoEditor.EsaphSpotLightStickers.Model.EsaphSpotLightSticker;
import esaph.spotlight.navigation.globalActions.CMTypes;
import esaph.spotlight.navigation.spotlight.Chats.Messages.ConversationMessage;

public class EsaphStickerChatObject extends ConversationMessage
{
    private EsaphSpotLightSticker esaphSpotLightSticker;

    public EsaphStickerChatObject(long _ID, long absender, long ID_RECEIVER, long uhrzeit, short messageStatus, EsaphSpotLightSticker esaphSpotLightSticker, String Absender,
                                  String jsonStringSpotInformations)
    {
        super(_ID, absender, ID_RECEIVER, uhrzeit, messageStatus, CMTypes.FSTI, Absender, jsonStringSpotInformations);
        this.esaphSpotLightSticker = esaphSpotLightSticker;
    }

    public EsaphSpotLightSticker getEsaphSpotLightSticker() {
        return esaphSpotLightSticker;
    }
}
