package androidx.media;

import android.media.AudioAttributes;
import o2.a;
import o2.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f1114a = (AudioAttributes) aVar.g(audioAttributesImplApi21.f1114a, 1);
        audioAttributesImplApi21.f1115b = aVar.f(audioAttributesImplApi21.f1115b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f1114a;
        aVar.i(1);
        ((b) aVar).e.writeParcelable(audioAttributes, 0);
        aVar.j(audioAttributesImplApi21.f1115b, 2);
    }
}
