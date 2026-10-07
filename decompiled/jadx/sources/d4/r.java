package d4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements u3.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u3.m f2897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2898c;

    public r(u3.m mVar, boolean z4) {
        this.f2897b = mVar;
        this.f2898c = z4;
    }

    @Override // u3.f
    public final void a(MessageDigest messageDigest) {
        this.f2897b.a(messageDigest);
    }

    @Override // u3.m
    public final w3.x b(Context context, w3.x xVar, int i, int i10) {
        x3.a aVar = com.bumptech.glide.b.a(context).f1839a;
        Drawable drawable = (Drawable) xVar.get();
        c cVarA = q.a(aVar, drawable, i, i10);
        if (cVarA != null) {
            w3.x xVarB = this.f2897b.b(context, cVarA, i, i10);
            if (!xVarB.equals(cVarA)) {
                return new c(context.getResources(), xVarB);
            }
            xVarB.b();
            return xVar;
        }
        if (!this.f2898c) {
            return xVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // u3.f
    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f2897b.equals(((r) obj).f2897b);
        }
        return false;
    }

    @Override // u3.f
    public final int hashCode() {
        return this.f2897b.hashCode();
    }
}
