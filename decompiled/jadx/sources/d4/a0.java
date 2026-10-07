package d4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements u3.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2859a;

    public /* synthetic */ a0(int i) {
        this.f2859a = i;
    }

    @Override // u3.k
    public final w3.x a(Object obj, int i, int i10, u3.i iVar) {
        switch (this.f2859a) {
            case 0:
                return new z((Bitmap) obj);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new f4.d(drawable, 0);
                }
                return null;
            default:
                return new z((File) obj);
        }
    }

    @Override // u3.k
    public final /* bridge */ /* synthetic */ boolean b(Object obj, u3.i iVar) {
        switch (this.f2859a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }
}
