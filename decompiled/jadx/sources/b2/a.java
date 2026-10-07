package b2;

import java.io.IOException;
import java.util.Locale;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2.b f1349a;

    public a(h2.b bVar) {
        i.e(bVar, "db");
        this.f1349a = bVar;
    }

    @Override // g2.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final g R(String str) {
        i.e(str, "sql");
        h2.b bVar = this.f1349a;
        i.e(bVar, "db");
        String string = pc.g.B0(str).toString();
        if (string.length() >= 3) {
            String strSubstring = string.substring(0, 3);
            i.d(strSubstring, "substring(...)");
            String upperCase = strSubstring.toUpperCase(Locale.ROOT);
            i.d(upperCase, "toUpperCase(...)");
            int iHashCode = upperCase.hashCode();
            if (iHashCode == 79487 ? upperCase.equals("PRA") : !(iHashCode == 81978 ? !upperCase.equals("SEL") : !(iHashCode == 85954 && upperCase.equals("WIT")))) {
                e eVar = new e(bVar, str);
                eVar.f1356d = new int[0];
                eVar.e = new long[0];
                eVar.f1357f = new double[0];
                eVar.f1358r = new String[0];
                eVar.f1359s = new byte[0][];
                return eVar;
            }
        }
        return new f(bVar, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f1349a.close();
    }
}
