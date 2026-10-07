package w3;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Appendable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Appendable f9571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9572b = true;

    public s(Appendable appendable) {
        this.f9571a = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c10) throws IOException {
        boolean z4 = this.f9572b;
        Appendable appendable = this.f9571a;
        if (z4) {
            this.f9572b = false;
            appendable.append("  ");
        }
        this.f9572b = c10 == '\n';
        appendable.append(c10);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i10) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z4 = this.f9572b;
        Appendable appendable = this.f9571a;
        boolean z10 = false;
        if (z4) {
            this.f9572b = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i10 - 1) == '\n') {
            z10 = true;
        }
        this.f9572b = z10;
        appendable.append(charSequence, i, i10);
        return this;
    }
}
