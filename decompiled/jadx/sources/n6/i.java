package n6;

import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbgc;
import e6.o;
import e6.q;
import e6.s;
import e6.t;
import e6.x2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f7300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzbgc f7301b;

    public i(Context context) {
        zzbgc zzbgcVar;
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f7300a = frameLayout;
        if (isInEditMode()) {
            zzbgcVar = null;
        } else {
            q qVar = s.f3427f.f3429b;
            Context context2 = frameLayout.getContext();
            qVar.getClass();
            zzbgcVar = (zzbgc) new o(qVar, this, frameLayout, context2).d(context2, false);
        }
        this.f7301b = zzbgcVar;
    }

    public final View a(String str) {
        zzbgc zzbgcVar = this.f7301b;
        if (zzbgcVar != null) {
            try {
                q7.a aVarZzb = zzbgcVar.zzb(str);
                if (aVarZzb != null) {
                    return (View) q7.b.I(aVarZzb);
                }
            } catch (RemoteException e) {
                i6.h.e("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f7300a);
    }

    public final void b(w5.m mVar) {
        zzbgc zzbgcVar = this.f7301b;
        if (zzbgcVar == null) {
            return;
        }
        try {
            if (mVar instanceof x2) {
                zzbgcVar.zzdx(((x2) mVar).f3461a);
            } else if (mVar == null) {
                zzbgcVar.zzdx(null);
            } else {
                i6.h.b("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            i6.h.e("Unable to call setMediaContent on delegate", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f7300a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final void c(View view, String str) {
        zzbgc zzbgcVar = this.f7301b;
        if (zzbgcVar == null) {
            return;
        }
        try {
            zzbgcVar.zzdv(str, new q7.b(view));
        } catch (RemoteException e) {
            i6.h.e("Unable to call setAssetView on delegate", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zzbgc zzbgcVar = this.f7301b;
        if (zzbgcVar != null) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzlh)).booleanValue()) {
                try {
                    zzbgcVar.zzd(new q7.b(motionEvent));
                } catch (RemoteException e) {
                    i6.h.e("Unable to call handleTouchEvent on delegate", e);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getAdChoicesView() {
        a("3011");
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final b getMediaView() {
        View viewA = a("3010");
        if (viewA instanceof b) {
            return (b) viewA;
        }
        if (viewA == null) {
            return null;
        }
        i6.h.b("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        zzbgc zzbgcVar = this.f7301b;
        if (zzbgcVar == null) {
            return;
        }
        try {
            zzbgcVar.zze(new q7.b(view), i);
        } catch (RemoteException e) {
            i6.h.e("Unable to call onVisibilityChanged on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.f7300a);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f7300a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(a aVar) {
        c(aVar, "3011");
    }

    public final void setAdvertiserView(View view) {
        c(view, "3005");
    }

    public final void setBodyView(View view) {
        c(view, "3004");
    }

    public final void setCallToActionView(View view) {
        c(view, "3002");
    }

    public final void setClickConfirmingView(View view) {
        zzbgc zzbgcVar = this.f7301b;
        if (zzbgcVar == null) {
            return;
        }
        try {
            zzbgcVar.zzdw(new q7.b(view));
        } catch (RemoteException e) {
            i6.h.e("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(View view) {
        c(view, "3001");
    }

    public final void setIconView(View view) {
        c(view, "3003");
    }

    public final void setImageView(View view) {
        c(view, "3008");
    }

    public final void setMediaView(b bVar) {
        c(bVar, "3010");
        if (bVar == null) {
            return;
        }
        a4.b bVar2 = new a4.b(this, 23);
        synchronized (bVar) {
            bVar.e = bVar2;
            if (bVar.f7284b) {
                b(bVar.f7283a);
            }
        }
        e7.i iVar = new e7.i(this, 28);
        synchronized (bVar) {
            bVar.f7287f = iVar;
            if (bVar.f7286d) {
                ImageView.ScaleType scaleType = bVar.f7285c;
                zzbgc zzbgcVar = this.f7301b;
                if (zzbgcVar != null && scaleType != null) {
                    try {
                        zzbgcVar.zzdy(new q7.b(scaleType));
                    } catch (RemoteException e) {
                        i6.h.e("Unable to call setMediaViewImageScaleType on delegate", e);
                    }
                }
            }
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        zzbgc zzbgcVar = this.f7301b;
        if (zzbgcVar == null) {
            return;
        }
        try {
            zzbgcVar.zzdz((q7.a) nativeAd.zza());
        } catch (RemoteException e) {
            i6.h.e("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(View view) {
        c(view, "3007");
    }

    public final void setStarRatingView(View view) {
        c(view, "3009");
    }

    public final void setStoreView(View view) {
        c(view, "3006");
    }
}
