package androidx.media;

import o2.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f1116a = aVar.f(audioAttributesImplBase.f1116a, 1);
        audioAttributesImplBase.f1117b = aVar.f(audioAttributesImplBase.f1117b, 2);
        audioAttributesImplBase.f1118c = aVar.f(audioAttributesImplBase.f1118c, 3);
        audioAttributesImplBase.f1119d = aVar.f(audioAttributesImplBase.f1119d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        aVar.j(audioAttributesImplBase.f1116a, 1);
        aVar.j(audioAttributesImplBase.f1117b, 2);
        aVar.j(audioAttributesImplBase.f1118c, 3);
        aVar.j(audioAttributesImplBase.f1119d, 4);
    }
}
