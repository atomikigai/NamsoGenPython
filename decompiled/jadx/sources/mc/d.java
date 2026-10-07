package mc;

import java.util.Iterator;
import jd.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class d implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7108c;

    public d(int i, int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i11 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f7106a = i;
        this.f7107b = l.k(i, i10, i11);
        this.f7108c = i11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f7106a == dVar.f7106a && this.f7107b == dVar.f7107b && this.f7108c == dVar.f7108c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f7106a * 31) + this.f7107b) * 31) + this.f7108c;
    }

    public boolean isEmpty() {
        int i = this.f7108c;
        int i10 = this.f7107b;
        int i11 = this.f7106a;
        if (i > 0) {
            return i11 > i10;
        }
        return i11 < i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f7106a, this.f7107b, this.f7108c);
    }

    public String toString() {
        StringBuilder sb2;
        int i = this.f7107b;
        int i10 = this.f7106a;
        int i11 = this.f7108c;
        if (i11 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append("..");
            sb2.append(i);
            sb2.append(" step ");
            sb2.append(i11);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append(" downTo ");
            sb2.append(i);
            sb2.append(" step ");
            sb2.append(-i11);
        }
        return sb2.toString();
    }
}
