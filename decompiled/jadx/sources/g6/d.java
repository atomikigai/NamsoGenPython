package g6;

import android.app.Activity;
import android.os.Bundle;
import h6.k0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i {
    public final /* synthetic */ int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Activity activity, int i) {
        super(activity);
        this.I = i;
    }

    @Override // g6.i, com.google.android.gms.internal.ads.zzbtg
    public void zzl(Bundle bundle) {
        switch (this.I) {
            case 4:
                k0.k("AdOverlayParcel is null or does not contain valid overlay type.");
                this.G = 4;
                this.f4196a.finish();
                break;
            default:
                super.zzl(bundle);
                break;
        }
    }
}
