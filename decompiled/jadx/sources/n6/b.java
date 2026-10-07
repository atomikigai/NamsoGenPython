package n6;

import android.os.RemoteException;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbgs;
import e6.x2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w5.m f7283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView.ScaleType f7285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7286d;
    public a4.b e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e7.i f7287f;

    public w5.m getMediaContent() {
        return this.f7283a;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        zzbgc zzbgcVar;
        this.f7286d = true;
        this.f7285c = scaleType;
        e7.i iVar = this.f7287f;
        if (iVar == null || (zzbgcVar = ((i) iVar.f3489b).f7301b) == null || scaleType == null) {
            return;
        }
        try {
            zzbgcVar.zzdy(new q7.b(scaleType));
        } catch (RemoteException e) {
            i6.h.e("Unable to call setMediaViewImageScaleType on delegate", e);
        }
    }

    public void setMediaContent(w5.m mVar) {
        boolean zZzl;
        boolean zZzr;
        this.f7284b = true;
        this.f7283a = mVar;
        a4.b bVar = this.e;
        if (bVar != null) {
            ((i) bVar.f113b).b(mVar);
        }
        if (mVar == null) {
            return;
        }
        try {
            zzbgs zzbgsVar = ((x2) mVar).f3462b;
            if (zzbgsVar != null) {
                boolean zZzk = false;
                try {
                    zZzl = ((x2) mVar).f3461a.zzl();
                } catch (RemoteException e) {
                    i6.h.e("", e);
                    zZzl = false;
                }
                if (!zZzl) {
                    try {
                        zZzk = ((x2) mVar).f3461a.zzk();
                    } catch (RemoteException e4) {
                        i6.h.e("", e4);
                    }
                    if (zZzk) {
                        zZzr = zzbgsVar.zzr(new q7.b(this));
                    }
                    removeAllViews();
                }
                zZzr = zzbgsVar.zzs(new q7.b(this));
                if (zZzr) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e10) {
            removeAllViews();
            i6.h.e("", e10);
        }
    }
}
