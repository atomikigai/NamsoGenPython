package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f1114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1115b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f1114a.equals(((AudioAttributesImplApi21) obj).f1114a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1114a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f1114a;
    }
}
