package a4;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import h6.o0;
import java.io.IOException;
import l.m3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements y, k, h2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f142a;

    public /* synthetic */ g(Context context) {
        this.f142a = context;
    }

    @Override // a4.k
    public Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // a4.k
    public Object b(Resources resources, int i, Resources.Theme theme) {
        return resources.openRawResourceFd(i);
    }

    public l5.j c() {
        Context context = this.f142a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        l5.j jVar = new l5.j();
        jVar.f6825a = n5.a.a(l5.m.f6832a);
        n5.c cVar = new n5.c(context);
        jVar.f6826b = cVar;
        jVar.f6827c = n5.a.a(new o0(12, cVar, new ib.c(cVar, 25)));
        n5.c cVar2 = jVar.f6826b;
        jVar.f6828d = new q3.e(cVar2);
        tb.a aVarA = n5.a.a(new s5.j(0, jVar.f6828d, n5.a.a(new o6.h0(cVar2))));
        jVar.e = aVarA;
        z9.c cVar3 = new z9.c();
        n5.c cVar4 = jVar.f6826b;
        q5.d dVar = new q5.d(cVar4, aVarA, cVar3);
        tb.a aVar = jVar.f6825a;
        tb.a aVar2 = jVar.f6827c;
        bd.u uVar = new bd.u(aVar, aVar2, dVar, aVarA, aVarA, 9);
        m3 m3Var = new m3();
        m3Var.f6359a = cVar4;
        m3Var.f6360b = aVar2;
        m3Var.f6361c = aVarA;
        m3Var.f6362d = dVar;
        m3Var.e = aVar;
        m3Var.f6363f = aVarA;
        m3Var.f6364r = aVarA;
        jVar.f6829f = n5.a.a(new a2.l(uVar, m3Var, new gb.r(aVar, aVarA, dVar, aVarA), 26));
        return jVar;
    }

    @Override // a4.k
    public void d(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }

    @Override // a4.y
    public x i(e0 e0Var) {
        return new c(this.f142a, this);
    }

    @Override // h2.d
    public h2.e n(com.bumptech.glide.manager.q qVar) {
        Context context = this.f142a;
        String str = (String) qVar.f1934c;
        h2.c cVar = (h2.c) qVar.f1935d;
        jc.i.e(cVar, "callback");
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        com.bumptech.glide.manager.q qVar2 = new com.bumptech.glide.manager.q(context, str, cVar, true);
        return new i2.i((Context) qVar2.f1933b, (String) qVar2.f1934c, (h2.c) qVar2.f1935d, qVar2.f1932a);
    }
}
