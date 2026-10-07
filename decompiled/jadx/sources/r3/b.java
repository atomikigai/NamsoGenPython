package r3;

import da.v;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import q3.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8131d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f8132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f8133g;
    public final List h;

    public b(String str, String str2, long j4, long j10, long j11, long j12, List list) {
        this.f8129b = str;
        this.f8130c = "".equals(str2) ? null : str2;
        this.f8131d = j4;
        this.e = j10;
        this.f8132f = j11;
        this.f8133g = j12;
        this.h = list;
    }

    public static b a(gb.d dVar) throws IOException {
        if (c.i(dVar) != 538247942) {
            throw new IOException();
        }
        String strK = c.k(dVar);
        String strK2 = c.k(dVar);
        long j4 = c.j(dVar);
        long j10 = c.j(dVar);
        long j11 = c.j(dVar);
        long j12 = c.j(dVar);
        int i = c.i(dVar);
        if (i < 0) {
            throw new IOException(v.f(i, "readHeaderList size="));
        }
        List arrayList = i == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i10 = 0; i10 < i; i10++) {
            arrayList.add(new q3.f(c.k(dVar).intern(), c.k(dVar).intern()));
        }
        return new b(strK, strK2, j4, j10, j11, j12, arrayList);
    }

    public final q3.b b(byte[] bArr) {
        q3.b bVar = new q3.b();
        bVar.f7978a = bArr;
        bVar.f7979b = this.f8130c;
        bVar.f7980c = this.f8131d;
        bVar.f7981d = this.e;
        bVar.e = this.f8132f;
        bVar.f7982f = this.f8133g;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        List<q3.f> list = this.h;
        for (q3.f fVar : list) {
            treeMap.put(fVar.f7991a, fVar.f7992b);
        }
        bVar.f7983g = treeMap;
        bVar.h = Collections.unmodifiableList(list);
        return bVar;
    }

    public final boolean c(BufferedOutputStream bufferedOutputStream) {
        try {
            c.m(bufferedOutputStream, 538247942);
            c.o(bufferedOutputStream, this.f8129b);
            String str = this.f8130c;
            if (str == null) {
                str = "";
            }
            c.o(bufferedOutputStream, str);
            c.n(bufferedOutputStream, this.f8131d);
            c.n(bufferedOutputStream, this.e);
            c.n(bufferedOutputStream, this.f8132f);
            c.n(bufferedOutputStream, this.f8133g);
            List<q3.f> list = this.h;
            if (list != null) {
                c.m(bufferedOutputStream, list.size());
                for (q3.f fVar : list) {
                    c.o(bufferedOutputStream, fVar.f7991a);
                    c.o(bufferedOutputStream, fVar.f7992b);
                }
            } else {
                c.m(bufferedOutputStream, 0);
            }
            bufferedOutputStream.flush();
            return true;
        } catch (IOException e) {
            q.b("%s", e.toString());
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    public b(String str, q3.b bVar) {
        String str2 = bVar.f7979b;
        long j4 = bVar.f7980c;
        long j10 = bVar.f7981d;
        long j11 = bVar.e;
        long j12 = bVar.f7982f;
        ?? arrayList = bVar.h;
        if (arrayList == 0) {
            Map map = bVar.f7983g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new q3.f((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j4, j10, j11, j12, arrayList);
    }
}
