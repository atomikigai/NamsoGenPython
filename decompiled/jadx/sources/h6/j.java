package h6;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.webkit.internal.AssetHelper;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzdvg;
import com.google.android.gms.internal.ads.zzdvk;
import com.google.android.gms.internal.ads.zzftd;
import com.google.android.gms.internal.ads.zzges;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzdvk f5011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f5013d;
    public String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f5014f;
    public final int h;
    public PointF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PointF f5016j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zzftd f5017k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5015g = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f5018l = new c(this, 2);

    public j(Context context) {
        this.f5010a = context;
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        d6.p pVar = d6.p.C;
        pVar.f2992s.a();
        this.f5017k = (zzftd) pVar.f2992s.f3640c;
        this.f5011b = (zzdvk) pVar.f2987n.f5034g;
    }

    public static final int e(ArrayList arrayList, String str, boolean z4) {
        if (!z4) {
            return -1;
        }
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f5015g = 0;
            this.i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.f5015g;
        if (i == -1) {
            return;
        }
        c cVar = this.f5018l;
        zzftd zzftdVar = this.f5017k;
        if (i == 0) {
            if (actionMasked == 5) {
                this.f5015g = 5;
                this.f5016j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                zzftdVar.postDelayed(cVar, ((Long) e6.t.f3437d.f3440c.zza(zzbcn.zzeI)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z4 = false;
                for (int i10 = 0; i10 < historySize; i10++) {
                    z4 |= !d(motionEvent.getHistoricalX(0, i10), motionEvent.getHistoricalY(0, i10), motionEvent.getHistoricalX(1, i10), motionEvent.getHistoricalY(1, i10));
                }
                if (d(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z4) {
                    return;
                }
            }
            this.f5015g = -1;
            zzftdVar.removeCallbacks(cVar);
        }
    }

    public final void b() {
        String str;
        Context context = this.f5010a;
        try {
            if (!(context instanceof Activity)) {
                i6.h.f("Can not create dialog without Activity Context");
                return;
            }
            d6.p pVar = d6.p.C;
            m mVar = pVar.f2987n;
            synchronized (mVar.f5031c) {
                str = (String) mVar.e;
            }
            String str2 = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative preview";
            }
            String str3 = true != pVar.f2987n.n() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iE = e(arrayList, "Ad information", true);
            final int iE2 = e(arrayList, str2, true);
            final int iE3 = e(arrayList, str3, true);
            boolean zBooleanValue = ((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zziO)).booleanValue();
            final int iE4 = e(arrayList, "Open ad inspector", zBooleanValue);
            final int iE5 = e(arrayList, "Ad inspector settings", zBooleanValue);
            AlertDialog.Builder builderI = r0.i(context);
            builderI.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: h6.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    final j jVar = this.f4990a;
                    zzdvk zzdvkVar = jVar.f5011b;
                    Context context2 = jVar.f5010a;
                    if (i != iE) {
                        if (i == iE2) {
                            i6.h.b("Debug mode [Creative Preview] selected.");
                            zzcaj.zza.execute(new c(jVar, 3));
                            return;
                        }
                        if (i == iE3) {
                            i6.h.b("Debug mode [Troubleshooting] selected.");
                            zzcaj.zza.execute(new c(jVar, 1));
                            return;
                        }
                        if (i == iE4) {
                            final zzges zzgesVar = zzcaj.zze;
                            zzges zzgesVar2 = zzcaj.zza;
                            if (zzdvkVar.zzq()) {
                                zzgesVar.execute(new c(jVar, 6));
                                return;
                            } else {
                                final int i10 = 0;
                                zzgesVar2.execute(new Runnable() { // from class: h6.d
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i10) {
                                            case 0:
                                                d6.p pVar2 = d6.p.C;
                                                m mVar2 = pVar2.f2987n;
                                                j jVar2 = jVar;
                                                Context context3 = jVar2.f5010a;
                                                if (!mVar2.l(context3, jVar2.f5013d, jVar2.e)) {
                                                    pVar2.f2987n.h(context3, jVar2.f5013d, jVar2.e);
                                                } else {
                                                    zzgesVar.execute(new c(jVar2, 4));
                                                }
                                                break;
                                            default:
                                                d6.p pVar3 = d6.p.C;
                                                m mVar3 = pVar3.f2987n;
                                                j jVar3 = jVar;
                                                Context context4 = jVar3.f5010a;
                                                if (!mVar3.l(context4, jVar3.f5013d, jVar3.e)) {
                                                    pVar3.f2987n.h(context4, jVar3.f5013d, jVar3.e);
                                                } else {
                                                    zzgesVar.execute(new c(jVar3, 5));
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (i == iE5) {
                            final zzges zzgesVar3 = zzcaj.zze;
                            zzges zzgesVar4 = zzcaj.zza;
                            if (zzdvkVar.zzq()) {
                                zzgesVar3.execute(new c(jVar, 0));
                                return;
                            } else {
                                final int i11 = 1;
                                zzgesVar4.execute(new Runnable() { // from class: h6.d
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                d6.p pVar2 = d6.p.C;
                                                m mVar2 = pVar2.f2987n;
                                                j jVar2 = jVar;
                                                Context context3 = jVar2.f5010a;
                                                if (!mVar2.l(context3, jVar2.f5013d, jVar2.e)) {
                                                    pVar2.f2987n.h(context3, jVar2.f5013d, jVar2.e);
                                                } else {
                                                    zzgesVar3.execute(new c(jVar2, 4));
                                                }
                                                break;
                                            default:
                                                d6.p pVar3 = d6.p.C;
                                                m mVar3 = pVar3.f2987n;
                                                j jVar3 = jVar;
                                                Context context4 = jVar3.f5010a;
                                                if (!mVar3.l(context4, jVar3.f5013d, jVar3.e)) {
                                                    pVar3.f2987n.h(context4, jVar3.f5013d, jVar3.e);
                                                } else {
                                                    zzgesVar3.execute(new c(jVar3, 5));
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        return;
                    }
                    if (!(context2 instanceof Activity)) {
                        i6.h.f("Can not create dialog without Activity Context");
                        return;
                    }
                    String str4 = jVar.f5012c;
                    final String str5 = "No debug information";
                    if (!TextUtils.isEmpty(str4)) {
                        Uri uriBuild = new Uri.Builder().encodedQuery(str4.replaceAll("\\+", "%20")).build();
                        StringBuilder sb2 = new StringBuilder();
                        r0 r0Var = d6.p.C.f2979c;
                        HashMap mapL = r0.l(uriBuild);
                        for (String str6 : mapL.keySet()) {
                            sb2.append(str6);
                            sb2.append(" = ");
                            sb2.append((String) mapL.get(str6));
                            sb2.append("\n\n");
                        }
                        String strTrim = sb2.toString().trim();
                        if (!TextUtils.isEmpty(strTrim)) {
                            str5 = strTrim;
                        }
                    }
                    r0 r0Var2 = d6.p.C.f2979c;
                    AlertDialog.Builder builderI2 = r0.i(context2);
                    builderI2.setMessage(str5);
                    builderI2.setTitle("Ad Information");
                    builderI2.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: h6.e
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i12) {
                            j jVar2 = jVar;
                            jVar2.getClass();
                            r0 r0Var3 = d6.p.C.f2979c;
                            r0.p(jVar2.f5010a, Intent.createChooser(new Intent("android.intent.action.SEND").setType(AssetHelper.DEFAULT_MIME_TYPE).putExtra("android.intent.extra.TEXT", str5), "Share via"));
                        }
                    });
                    builderI2.setNegativeButton("Close", new f());
                    builderI2.create().show();
                }
            });
            builderI.create().show();
        } catch (WindowManager.BadTokenException e) {
            k0.l("", e);
        }
    }

    public final void c(Context context) {
        final int i;
        ArrayList arrayList = new ArrayList();
        int iE = e(arrayList, "None", true);
        final int iE2 = e(arrayList, "Shake", true);
        final int iE3 = e(arrayList, "Flick", true);
        int iOrdinal = this.f5011b.zza().ordinal();
        if (iOrdinal != 1) {
            i = iOrdinal != 2 ? iE : iE3;
        } else {
            i = iE2;
        }
        r0 r0Var = d6.p.C.f2979c;
        AlertDialog.Builder builderI = r0.i(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        builderI.setTitle("Setup gesture");
        builderI.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new h(atomicInteger, 0));
        builderI.setNegativeButton("Dismiss", new h(this, 1));
        builderI.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: h6.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                j jVar = this.f5003a;
                zzdvk zzdvkVar = jVar.f5011b;
                AtomicInteger atomicInteger2 = atomicInteger;
                if (atomicInteger2.get() != i) {
                    if (atomicInteger2.get() == iE2) {
                        zzdvkVar.zzm(zzdvg.SHAKE);
                    } else if (atomicInteger2.get() == iE3) {
                        zzdvkVar.zzm(zzdvg.FLICK);
                    } else {
                        zzdvkVar.zzm(zzdvg.NONE);
                    }
                }
                jVar.b();
            }
        });
        builderI.setOnCancelListener(new androidx.fragment.app.i(this, 1));
        builderI.create().show();
    }

    public final boolean d(float f10, float f11, float f12, float f13) {
        float fAbs = Math.abs(this.i.x - f10);
        int i = this.h;
        return fAbs < ((float) i) && Math.abs(this.i.y - f11) < ((float) i) && Math.abs(this.f5016j.x - f12) < ((float) i) && Math.abs(this.f5016j.y - f13) < ((float) i);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("{Dialog: ");
        sb2.append(this.f5012c);
        sb2.append(",DebugSignal: ");
        sb2.append(this.f5014f);
        sb2.append(",AFMA Version: ");
        sb2.append(this.e);
        sb2.append(",Ad Unit ID: ");
        return q1.a.m(sb2, this.f5013d, "}");
    }
}
