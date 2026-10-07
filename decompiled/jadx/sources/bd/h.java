package bd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1594a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f1597d;

    public i a() {
        return new i(this.f1594a, this.f1595b, (String[]) this.f1596c, (String[]) this.f1597d);
    }

    public void b(g... gVarArr) {
        jc.i.e(gVarArr, "cipherSuites");
        if (!this.f1594a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(gVarArr.length);
        for (g gVar : gVarArr) {
            arrayList.add(gVar.f1593a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... strArr) {
        jc.i.e(strArr, "cipherSuites");
        if (!this.f1594a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f1596c = (String[]) strArr.clone();
    }

    public void d(b0... b0VarArr) {
        if (!this.f1594a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(b0VarArr.length);
        for (b0 b0Var : b0VarArr) {
            arrayList.add(b0Var.f1558a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... strArr) {
        jc.i.e(strArr, "tlsVersions");
        if (!this.f1594a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f1597d = (String[]) strArr.clone();
    }
}
