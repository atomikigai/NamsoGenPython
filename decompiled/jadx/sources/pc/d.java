package pc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f7858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7861d;
    public int e;

    public d(CharSequence charSequence) {
        jc.i.e(charSequence, "string");
        this.f7858a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i10;
        int i11 = this.f7859b;
        if (i11 != 0) {
            return i11 == 1;
        }
        if (this.e < 0) {
            this.f7859b = 2;
            return false;
        }
        CharSequence charSequence = this.f7858a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i12 = this.f7860c; i12 < length2; i12++) {
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i10 = i12 + 1) < charSequence.length() && charSequence.charAt(i10) == '\n') ? 2 : 1;
                length = i12;
                this.f7859b = 1;
                this.e = i;
                this.f7861d = length;
                return true;
            }
        }
        i = -1;
        this.f7859b = 1;
        this.e = i;
        this.f7861d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7859b = 0;
        int i = this.f7861d;
        int i10 = this.f7860c;
        this.f7860c = this.e + i;
        return this.f7858a.subSequence(i10, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
