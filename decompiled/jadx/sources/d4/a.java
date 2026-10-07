package d4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements u3.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2858c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f2856a = i;
        this.f2857b = obj;
        this.f2858c = obj2;
    }

    @Override // u3.k
    public final w3.x a(Object obj, int i, int i10, u3.i iVar) {
        boolean z4;
        w wVar;
        p4.e eVar;
        switch (this.f2856a) {
            case 0:
                w3.x xVarA = ((u3.k) this.f2857b).a(obj, i, i10, iVar);
                Resources resources = (Resources) this.f2858c;
                if (xVarA == null) {
                    return null;
                }
                return new c(resources, xVarA);
            case 1:
                w3.x xVarC = ((f4.e) this.f2857b).c((Uri) obj, iVar);
                if (xVarC == null) {
                    return null;
                }
                return q.a((x3.a) this.f2858c, (Drawable) ((f4.d) xVarC).get(), i, i10);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof w) {
                    wVar = (w) inputStream;
                    z4 = false;
                } else {
                    z4 = true;
                    wVar = new w(inputStream, (x3.f) this.f2858c);
                }
                ArrayDeque arrayDeque = p4.e.f7794c;
                synchronized (arrayDeque) {
                    eVar = (p4.e) arrayDeque.poll();
                    break;
                }
                if (eVar == null) {
                    eVar = new p4.e();
                }
                p4.e eVar2 = eVar;
                eVar2.f7795a = wVar;
                p4.k kVar = new p4.k(eVar2);
                aa.c cVar = new aa.c(15, wVar, eVar2);
                try {
                    o oVar = (o) this.f2857b;
                    c cVarA = oVar.a(new a2.l(kVar, oVar.f2895d, oVar.f2894c), i, i10, iVar, cVar);
                    eVar2.f7796b = null;
                    eVar2.f7795a = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(eVar2);
                        break;
                    }
                    return cVarA;
                } finally {
                    eVar2.f7796b = null;
                    eVar2.f7795a = null;
                    ArrayDeque arrayDeque2 = p4.e.f7794c;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(eVar2);
                        if (z4) {
                            wVar.d();
                        }
                    }
                }
        }
    }

    @Override // u3.k
    public final boolean b(Object obj, u3.i iVar) {
        switch (this.f2856a) {
            case 0:
                return ((u3.k) this.f2857b).b(obj, iVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((o) this.f2857b).getClass();
                return true;
        }
    }

    public a(Resources resources, u3.k kVar) {
        this.f2856a = 0;
        this.f2858c = resources;
        this.f2857b = kVar;
    }
}
