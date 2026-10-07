package a2;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements g2.a, zc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2.a f30a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.a f31b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public yb.i f32c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f33d;

    public i(g2.a aVar) {
        zc.d dVarA = zc.e.a();
        jc.i.e(aVar, "delegate");
        this.f30a = aVar;
        this.f31b = dVarA;
    }

    @Override // g2.a
    public final g2.c R(String str) {
        jc.i.e(str, "sql");
        return this.f30a.R(str);
    }

    @Override // zc.a
    public final Object c(ac.c cVar) {
        return this.f31b.c(cVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.f30a.close();
    }

    @Override // zc.a
    public final void d(Object obj) {
        this.f31b.d(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v1, types: [vb.q] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    public final void g(StringBuilder sb2) {
        ?? D;
        if (this.f32c == null && this.f33d == null) {
            sb2.append("\t\tStatus: Free connection");
            sb2.append('\n');
            return;
        }
        sb2.append("\t\tStatus: Acquired connection");
        sb2.append('\n');
        yb.i iVar = this.f32c;
        if (iVar != null) {
            sb2.append("\t\tCoroutine: " + iVar);
            sb2.append('\n');
        }
        Throwable th = this.f33d;
        if (th != null) {
            sb2.append("\t\tAcquired:");
            sb2.append('\n');
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String string = stringWriter.toString();
            jc.i.d(string, "toString(...)");
            pc.d dVar = new pc.d(string);
            boolean zHasNext = dVar.hasNext();
            ?? arrayList = vb.q.f9297a;
            if (zHasNext) {
                Object next = dVar.next();
                if (dVar.hasNext()) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(next);
                    while (dVar.hasNext()) {
                        arrayList2.add(dVar.next());
                    }
                    D = arrayList2;
                } else {
                    D = jd.d.D(next);
                }
            } else {
                D = arrayList;
            }
            int size = D.size() - 1;
            if (size > 0) {
                if (size != 1) {
                    arrayList = new ArrayList(size);
                    if (D instanceof RandomAccess) {
                        int size2 = D.size();
                        for (int i = 1; i < size2; i++) {
                            arrayList.add(D.get(i));
                        }
                    } else {
                        ListIterator listIterator = D.listIterator(1);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                } else {
                    if (D.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    arrayList = jd.d.D(D.get(vb.j.R(D)));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb2.append("\t\t" + ((String) it.next()));
                sb2.append('\n');
            }
        }
    }

    public final String toString() {
        return this.f30a.toString();
    }
}
