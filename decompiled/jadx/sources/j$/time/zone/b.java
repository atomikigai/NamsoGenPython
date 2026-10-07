package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparable, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = -6946044323557704546L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f5557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZoneOffset f5558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f5559d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f5556a, ((b) obj).f5556a);
    }

    public b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f5556a = localDateTime.t(zoneOffset);
        this.f5557b = localDateTime;
        this.f5558c = zoneOffset;
        this.f5559d = zoneOffset2;
    }

    public b(long j4, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f5556a = j4;
        this.f5557b = LocalDateTime.K(j4, 0, zoneOffset);
        this.f5558c = zoneOffset;
        this.f5559d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final boolean u() {
        return this.f5559d.f5371a > this.f5558c.f5371a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f5556a == bVar.f5556a && this.f5558c.equals(bVar.f5558c) && this.f5559d.equals(bVar.f5559d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5557b.hashCode() ^ this.f5558c.f5371a) ^ Integer.rotateLeft(this.f5559d.f5371a, 16);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Transition[");
        sb2.append(u() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f5557b);
        sb2.append(this.f5558c);
        sb2.append(" to ");
        sb2.append(this.f5559d);
        sb2.append(']');
        return sb2.toString();
    }
}
