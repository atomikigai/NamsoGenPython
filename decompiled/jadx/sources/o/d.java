package o;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f7413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f7415d;
    public final /* synthetic */ g e;

    public d(g gVar, int i, Uri uri, boolean z4, Bundle bundle) {
        this.e = gVar;
        this.f7412a = i;
        this.f7413b = uri;
        this.f7414c = z4;
        this.f7415d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.f7427b.onRelationshipValidationResult(this.f7412a, this.f7413b, this.f7414c, this.f7415d);
    }
}
