/*
 *  Copyright (C) Esaph, Julian Auguscik - All Rights Reserved
 *  * Unauthorized copying of this file, via any medium is strictly prohibited
 *  * Proprietary and confidential
 *  * Written by Julian Auguscik <esaph.re@gmail.com>, March  2020
 *
 */

package esaph.spotlight.Esaph;

import java.io.Serializable;

public abstract class EsaphMark implements Serializable
{
    public static enum MOMENTS_VIEW_MARKSTATES
    {
        NONE,
        MARK_MOMENTS_IMAGE_BIG
    }

    private MOMENTS_VIEW_MARKSTATES MARK_STATE = MOMENTS_VIEW_MARKSTATES.NONE;

    public MOMENTS_VIEW_MARKSTATES getMARK_STATE() {
        return MARK_STATE;
    }

    public void setMARK_STATE(MOMENTS_VIEW_MARKSTATES MARK_STATE) {
        this.MARK_STATE = MARK_STATE;
    }
}
