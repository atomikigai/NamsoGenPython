package a4;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f177b;

    public t(Context context, int i) {
        this.f176a = i;
        switch (i) {
            case 1:
                this.f177b = context.getApplicationContext();
                break;
            case 2:
                this.f177b = context.getApplicationContext();
                break;
            default:
                this.f177b = context;
                break;
        }
    }

    @Override // a4.x
    public final boolean a(Object obj) {
        switch (this.f176a) {
            case 0:
                return a.a.i((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return a.a.i(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return a.a.i(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    @Override // a4.x
    public final w b(Object obj, int i, int i10, u3.i iVar) {
        Long l2;
        switch (this.f176a) {
            case 0:
                Uri uri = (Uri) obj;
                return new w(new o4.d(uri), new s(0, this.f177b, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i10 == Integer.MIN_VALUE || i > 512 || i10 > 384) {
                    return null;
                }
                o4.d dVar = new o4.d(uri2);
                Context context = this.f177b;
                return new w(dVar, f.b(context, uri2, new v3.a(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i10 == Integer.MIN_VALUE || i > 512 || i10 > 384 || (l2 = (Long) iVar.c(d4.d0.f2867d)) == null || l2.longValue() != -1) {
                    return null;
                }
                o4.d dVar2 = new o4.d(uri3);
                Context context2 = this.f177b;
                return new w(dVar2, f.b(context2, uri3, new v3.a(context2.getContentResolver(), 1)));
        }
    }
}
