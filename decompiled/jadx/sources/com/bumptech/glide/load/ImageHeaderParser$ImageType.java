package com.bumptech.glide.load;

import u3.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1887a;

    ImageHeaderParser$ImageType(boolean z4) {
        this.f1887a = z4;
    }

    public boolean hasAlpha() {
        return this.f1887a;
    }

    public boolean isWebp() {
        int i = d.f8846a[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
