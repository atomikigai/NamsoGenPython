package h4;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import u3.m;
import w3.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f4943b;

    public d(m mVar) {
        p4.f.c(mVar, "Argument must not be null");
        this.f4943b = mVar;
    }

    @Override // u3.f
    public final void a(MessageDigest messageDigest) {
        this.f4943b.a(messageDigest);
    }

    @Override // u3.m
    public final x b(Context context, x xVar, int i, int i10) {
        c cVar = (c) xVar.get();
        x cVar2 = new d4.c(((g) cVar.f4934a.f4933b).f4958l, com.bumptech.glide.b.a(context).f1839a);
        m mVar = this.f4943b;
        x xVarB = mVar.b(context, cVar2, i, i10);
        if (!cVar2.equals(xVarB)) {
            cVar2.b();
        }
        ((g) cVar.f4934a.f4933b).c(mVar, (Bitmap) xVarB.get());
        return xVar;
    }

    @Override // u3.f
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f4943b.equals(((d) obj).f4943b);
        }
        return false;
    }

    @Override // u3.f
    public final int hashCode() {
        return this.f4943b.hashCode();
    }
}
