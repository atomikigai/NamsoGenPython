package a4;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f144b;

    public /* synthetic */ g0(x xVar, int i) {
        this.f143a = i;
        this.f144b = xVar;
    }

    @Override // a4.x
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.f143a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // a4.x
    public final w b(Object obj, int i, int i10, u3.i iVar) {
        Uri uriFromFile;
        switch (this.f143a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null) {
                    return null;
                }
                x xVar = this.f144b;
                if (xVar.a(uriFromFile)) {
                    return xVar.b(uriFromFile, i, i10, iVar);
                }
                return null;
            default:
                return this.f144b.b(new n((URL) obj), i, i10, iVar);
        }
    }
}
