package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5460a;

    public l(String str) {
        this.f5460a = str;
    }

    @Override // j$.time.format.f
    public final boolean u(p pVar, StringBuilder sb2) {
        sb2.append(this.f5460a);
        return true;
    }

    public final String toString() {
        return "'" + this.f5460a.replace("'", "''") + "'";
    }
}
