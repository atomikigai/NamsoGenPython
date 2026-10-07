package q0;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends f1.c {
    public final /* synthetic */ int e;

    public a0(int i, Class cls, int i10, int i11, int i12) {
        this.e = i12;
        this.f3575a = i;
        this.f3578d = cls;
        this.f3577c = i10;
        this.f3576b = i11;
    }

    @Override // f1.c
    public final Object c(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(o0.d(view));
            case 1:
                return o0.b(view);
            default:
                return Boolean.valueOf(o0.c(view));
        }
    }

    @Override // f1.c
    public final void d(View view, Object obj) {
        switch (this.e) {
            case 0:
                o0.j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                o0.h(view, (CharSequence) obj);
                break;
            default:
                o0.g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // f1.c
    public final boolean g(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
