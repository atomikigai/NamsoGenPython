package j$.time.chrono;

import j$.time.LocalDateTime;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f5416c = new t();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.m
    public final n x(int i) {
        if (i == 0) {
            return u.BCE;
        }
        if (i == 1) {
            return u.CE;
        }
        throw new j$.time.a("Invalid era: " + i);
    }

    @Override // j$.time.chrono.m
    public final String o() {
        return "ISO";
    }

    @Override // j$.time.chrono.m
    public final String s() {
        return "iso8601";
    }

    @Override // j$.time.chrono.m
    public final b A(j$.time.temporal.n nVar) {
        return j$.time.f.C(nVar);
    }

    private t() {
    }

    @Override // j$.time.chrono.m
    public final e B(LocalDateTime localDateTime) {
        return LocalDateTime.w(localDateTime);
    }

    public static boolean w(long j4) {
        if ((3 & j4) == 0) {
            return j4 % 100 != 0 || j4 % 400 == 0;
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new f0((byte) 1, this);
    }
}
