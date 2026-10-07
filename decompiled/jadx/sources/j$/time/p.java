package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f5502d = new p(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5505c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        Object[] objArr = {j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS};
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        Collections.unmodifiableList(arrayList);
    }

    public p(int i, int i10, int i11) {
        this.f5503a = i;
        this.f5504b = i10;
        this.f5505c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f5503a == pVar.f5503a && this.f5504b == pVar.f5504b && this.f5505c == pVar.f5505c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f5505c, 16) + Integer.rotateLeft(this.f5504b, 8) + this.f5503a;
    }

    public final String toString() {
        if (this == f5502d) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder("P");
        int i = this.f5503a;
        if (i != 0) {
            sb2.append(i);
            sb2.append('Y');
        }
        int i10 = this.f5504b;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        int i11 = this.f5505c;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('D');
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new q((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
