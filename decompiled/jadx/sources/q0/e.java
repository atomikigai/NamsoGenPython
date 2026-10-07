package q0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements f, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7893a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7894b;

    public e(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.f7894b = contentInfo;
    }

    @Override // q0.h
    public ClipData a() {
        return ((ContentInfo) this.f7894b).getClip();
    }

    @Override // q0.f
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f7894b).setLinkUri(uri);
    }

    @Override // q0.f
    public i build() {
        return new i(new e(((ContentInfo.Builder) this.f7894b).build()));
    }

    @Override // q0.f
    public void c(int i) {
        ((ContentInfo.Builder) this.f7894b).setFlags(i);
    }

    @Override // q0.h
    public int d() {
        return ((ContentInfo) this.f7894b).getFlags();
    }

    @Override // q0.h
    public ContentInfo e() {
        return (ContentInfo) this.f7894b;
    }

    @Override // q0.h
    public int f() {
        return ((ContentInfo) this.f7894b).getSource();
    }

    @Override // q0.f
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f7894b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f7893a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.f7894b) + "}";
            default:
                return super.toString();
        }
    }

    public e(ClipData clipData, int i) {
        this.f7894b = d.a(clipData, i);
    }
}
