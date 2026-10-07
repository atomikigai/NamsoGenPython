package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f5389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5392d;

    static {
        Object[] objArr = {j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS};
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        Collections.unmodifiableList(arrayList);
    }

    public h(m mVar, int i, int i10, int i11) {
        this.f5389a = mVar;
        this.f5390b = i;
        this.f5391c = i10;
        this.f5392d = i11;
    }

    public final String toString() {
        if (this.f5390b == 0 && this.f5391c == 0 && this.f5392d == 0) {
            return this.f5389a.toString() + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f5389a.toString());
        sb2.append(" P");
        int i = this.f5390b;
        if (i != 0) {
            sb2.append(i);
            sb2.append('Y');
        }
        int i10 = this.f5391c;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        int i11 = this.f5392d;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('D');
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f5390b == hVar.f5390b && this.f5391c == hVar.f5391c && this.f5392d == hVar.f5392d && this.f5389a.equals(hVar.f5389a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.f5392d, 16) + (Integer.rotateLeft(this.f5391c, 8) + this.f5390b)) ^ this.f5389a.hashCode();
    }

    public Object writeReplace() {
        return new f0((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
