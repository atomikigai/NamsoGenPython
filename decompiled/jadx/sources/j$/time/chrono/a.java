package j$.time.chrono;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f5375a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f5376b = new ConcurrentHashMap();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return o().compareTo(((m) obj).o());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    public static m u(m mVar, String str) {
        String strS;
        m mVar2 = (m) f5375a.putIfAbsent(str, mVar);
        if (mVar2 == null && (strS = mVar.s()) != null) {
            f5376b.putIfAbsent(strS, mVar);
        }
        return mVar2;
    }

    @Override // j$.time.chrono.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && o().compareTo(((a) obj).o()) == 0;
    }

    @Override // j$.time.chrono.m
    public final int hashCode() {
        return getClass().hashCode() ^ o().hashCode();
    }

    @Override // j$.time.chrono.m
    public final String toString() {
        return o();
    }
}
