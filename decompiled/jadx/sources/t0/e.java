package t0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputContentInfo f8522a;

    public e(Object obj) {
        this.f8522a = (InputContentInfo) obj;
    }

    @Override // t0.f
    public final Uri a() {
        return this.f8522a.getContentUri();
    }

    @Override // t0.f
    public final void b() {
        this.f8522a.requestPermission();
    }

    @Override // t0.f
    public final Uri c() {
        return this.f8522a.getLinkUri();
    }

    @Override // t0.f
    public final Object d() {
        return this.f8522a;
    }

    @Override // t0.f
    public final ClipDescription getDescription() {
        return this.f8522a.getDescription();
    }

    public e(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f8522a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
