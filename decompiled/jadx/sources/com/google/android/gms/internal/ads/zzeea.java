package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import androidx.webkit.ProxyConfig;
import app.namso_gen.spacehowen.R;
import d0.g0;
import d0.h0;
import d6.p;
import e6.t;
import g6.i;
import h6.r0;
import h6.z;
import i6.h;
import i6.k;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeea extends zzbsy {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdsm zzc;
    private final k zzd;
    private final zzedp zze;
    private String zzf;
    private String zzg;

    public zzeea(Context context, zzedp zzedpVar, k kVar, zzdsm zzdsmVar) {
        this.zzb = context;
        this.zzc = zzdsmVar;
        this.zzd = kVar;
        this.zze = zzedpVar;
    }

    public static void zzc(Context context, zzdsm zzdsmVar, zzedp zzedpVar, String str, String str2) {
        zzd(context, zzdsmVar, zzedpVar, str, str2, new HashMap());
    }

    public static void zzd(Context context, zzdsm zzdsmVar, zzedp zzedpVar, String str, String str2, Map map) {
        String strZze;
        p pVar = p.C;
        String str3 = true != pVar.f2982g.zzA(context) ? "offline" : o.a.ONLINE_EXTRAS_KEY;
        if (zzdsmVar != null) {
            zzdsl zzdslVarZza = zzdsmVar.zza();
            zzdslVarZza.zzb("gqi", str);
            zzdslVarZza.zzb("action", str2);
            zzdslVarZza.zzb("device_connectivity", str3);
            pVar.f2983j.getClass();
            zzdslVarZza.zzb("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzdslVarZza.zzb((String) entry.getKey(), (String) entry.getValue());
            }
            strZze = zzdslVarZza.zze();
        } else {
            strZze = "";
        }
        String str4 = strZze;
        p.C.f2983j.getClass();
        zzedpVar.zzd(new zzedr(System.currentTimeMillis(), str, str4, 2));
    }

    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return zzftr.zzb(context, 0, intent, zzftr.zza | 1073741824, 0);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return zzftr.zza(context, 0, intent, 201326592);
    }

    private static XmlResourceParser zzs(int i) {
        Resources resourcesZze = p.C.f2982g.zze();
        if (resourcesZze == null) {
            return null;
        }
        try {
            return resourcesZze.getLayout(i);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final String zzt() {
        zzedh zzedhVar = (zzedh) this.zza.get(this.zzf);
        return zzedhVar == null ? "" : zzedhVar.zzb();
    }

    private static String zzu(int i, String str) {
        Resources resourcesZze = p.C.f2982g.zze();
        if (resourcesZze == null) {
            return str;
        }
        try {
            return resourcesZze.getString(i);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    private final void zzv(String str, String str2, Map map) {
        zzd(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    private final void zzw() {
        boolean zZzg;
        try {
            r0 r0Var = p.C.f2979c;
            z zVarJ = r0.J(this.zzb);
            b bVar = new b(this.zzb);
            String str = this.zzg;
            String str2 = this.zzf;
            zzedh zzedhVar = (zzedh) this.zza.get(str2);
            zZzg = zVarJ.zzg(bVar, new f6.a(str, str2, zzedhVar == null ? "" : zzedhVar.zzc()));
            if (!zZzg) {
                try {
                    zZzg = zVarJ.zzf(new b(this.zzb), this.zzg, this.zzf);
                } catch (RemoteException e) {
                    e = e;
                    h.e("Failed to schedule offline notification poster.", e);
                }
            }
        } catch (RemoteException e4) {
            e = e4;
            zZzg = false;
        }
        if (zZzg) {
            return;
        }
        this.zze.zzc(this.zzf);
        zzv(this.zzf, "offline_notification_worker_not_scheduled", zzfzr.zzd());
    }

    private final void zzx(final Activity activity, final i iVar) {
        p pVar = p.C;
        r0 r0Var = pVar.f2979c;
        if (g0.a(new h0(activity).f2759a)) {
            zzw();
            zzy(activity, iVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzv(this.zzf, "asnpdi", zzfzr.zzd());
                return;
            }
            r0 r0Var2 = pVar.f2979c;
            AlertDialog.Builder builderI = r0.i(activity);
            builderI.setTitle(zzu(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzu(R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzedt
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.zza.zzk(activity, iVar, dialogInterface, i);
                }
            }).setNegativeButton(zzu(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzedu
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.zza.zzl(iVar, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzedv
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.zza.zzm(iVar, dialogInterface);
                }
            });
            builderI.create().show();
            zzv(this.zzf, "rtsdi", zzfzr.zzd());
        }
    }

    private final void zzy(Activity activity, final i iVar) {
        AlertDialog alertDialogCreate;
        r0 r0Var = p.C.f2979c;
        AlertDialog.Builder onCancelListener = r0.i(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeds
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                i iVar2 = iVar;
                if (iVar2 != null) {
                    iVar2.zzb();
                }
            }
        });
        XmlResourceParser xmlResourceParserZzs = zzs(R.layout.offline_ads_dialog);
        if (xmlResourceParserZzs == null) {
            onCancelListener.setMessage(zzu(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            alertDialogCreate = onCancelListener.create();
        } else {
            View viewInflate = activity.getLayoutInflater().inflate(xmlResourceParserZzs, (ViewGroup) null);
            onCancelListener.setView(viewInflate);
            String strZzt = zzt();
            if (!strZzt.isEmpty()) {
                TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(strZzt);
            }
            zzedh zzedhVar = (zzedh) this.zza.get(this.zzf);
            Drawable drawableZza = zzedhVar != null ? zzedhVar.zza() : null;
            if (drawableZza != null) {
                ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawableZza);
            }
            alertDialogCreate = onCancelListener.create();
            alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialogCreate.show();
        Timer timer = new Timer();
        timer.schedule(new zzedz(this, alertDialogCreate, timer, iVar), 3000L);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zZzA = p.C.f2982g.zzA(this.zzb);
            HashMap map = new HashMap();
            char c10 = 2;
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                c10 = true == zZzA ? (char) 1 : (char) 2;
                map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                map.put("olaih", String.valueOf(stringExtra3.startsWith(ProxyConfig.MATCH_HTTP)));
                try {
                    Intent launchIntentForPackage = this.zzb.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.zzb.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzv(stringExtra2, "offline_notification_action", map);
            try {
                SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                if (c10 == 1) {
                    this.zze.zzg(writableDatabase, this.zzd, stringExtra2);
                } else {
                    zzedp.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                h.d("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzf(String[] strArr, int[] iArr, q7.a aVar) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                zzeec zzeecVar = (zzeec) b.I(aVar);
                Activity activityZza = zzeecVar.zza();
                i iVarZzb = zzeecVar.zzb();
                HashMap map = new HashMap();
                if (iArr[i] == 0) {
                    map.put("dialog_action", "confirm");
                    zzw();
                    zzy(activityZza, iVarZzb);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (iVarZzb != null) {
                        iVarZzb.zzb();
                    }
                }
                zzv(this.zzf, "asnpdc", map);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzg(q7.a aVar) {
        zzeec zzeecVar = (zzeec) b.I(aVar);
        final Activity activityZza = zzeecVar.zza();
        final i iVarZzb = zzeecVar.zzb();
        this.zzf = zzeecVar.zzc();
        this.zzg = zzeecVar.zzd();
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzie)).booleanValue()) {
            zzx(activityZza, iVarZzb);
            return;
        }
        zzv(this.zzf, "dialog_impression", zzfzr.zzd());
        r0 r0Var = p.C.f2979c;
        AlertDialog.Builder builderI = r0.i(activityZza);
        builderI.setTitle(zzu(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzu(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzu(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzedw
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.zza.zzn(activityZza, iVarZzb, dialogInterface, i);
            }
        }).setNegativeButton(zzu(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzedx
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.zza.zzo(iVarZzb, dialogInterface, i);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzedy
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.zza.zzp(iVarZzb, dialogInterface);
            }
        });
        builderI.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzh() {
        final k kVar = this.zzd;
        this.zze.zze(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzedi
            @Override // com.google.android.gms.internal.ads.zzfiv
            public final Object zza(Object obj) throws Exception {
                zzedp.zzb(kVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzi(q7.a aVar, String str, String str2) {
        zzj(aVar, new f6.a(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzj(q7.a aVar, f6.a aVar2) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) b.I(aVar);
        String str2 = aVar2.f3611a;
        String str3 = aVar2.f3612b;
        String str4 = aVar2.f3613c;
        String strZzt = zzt();
        p.C.e.c(context);
        PendingIntent pendingIntentZzr = zzr(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentZzr2 = zzr(context, "offline_notification_dismissed", str3, str2);
        d0.t tVar = new d0.t(context, "offline_notification_channel");
        if (strZzt.isEmpty()) {
            tVar.e = d0.t.b(zzu(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            tVar.e = d0.t.b(String.format(zzu(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), strZzt));
        }
        tVar.c(true);
        tVar.f2784s.deleteIntent = pendingIntentZzr2;
        tVar.f2774g = pendingIntentZzr;
        tVar.f2784s.icon = context.getApplicationInfo().icon;
        zzbce zzbceVar = zzbcn.zzif;
        t tVar2 = t.f3437d;
        tVar.f2775j = ((Integer) tVar2.f3440c.zza(zzbceVar)).intValue();
        if (!((Boolean) tVar2.f3440c.zza(zzbcn.zzih)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
                bitmapDecodeStream = null;
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                tVar.d(bitmapDecodeStream);
                d0.p pVar = new d0.p();
                IconCompat iconCompat = new IconCompat(1);
                iconCompat.f586b = bitmapDecodeStream;
                pVar.e = iconCompat;
                pVar.f2767f = null;
                pVar.f2768g = true;
                tVar.e(pVar);
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, tVar.a());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e) {
            map.put("notification_not_shown_reason", e.getMessage());
            str = "offline_notification_failed";
        }
        zzv(str3, str, map);
    }

    public final void zzk(Activity activity, i iVar, DialogInterface dialogInterface, int i) {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        zzv(this.zzf, "rtsdc", map);
        activity.startActivity(p.C.e.a(activity));
        zzw();
        if (iVar != null) {
            iVar.zzb();
        }
    }

    public final /* synthetic */ void zzl(i iVar, DialogInterface dialogInterface, int i) {
        this.zze.zzc(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzv(this.zzf, "rtsdc", map);
        if (iVar != null) {
            iVar.zzb();
        }
    }

    public final /* synthetic */ void zzm(i iVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzv(this.zzf, "rtsdc", map);
        if (iVar != null) {
            iVar.zzb();
        }
    }

    public final /* synthetic */ void zzn(Activity activity, i iVar, DialogInterface dialogInterface, int i) {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        zzv(this.zzf, "dialog_click", map);
        zzx(activity, iVar);
    }

    public final /* synthetic */ void zzo(i iVar, DialogInterface dialogInterface, int i) {
        this.zze.zzc(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzv(this.zzf, "dialog_click", map);
        if (iVar != null) {
            iVar.zzb();
        }
    }

    public final /* synthetic */ void zzp(i iVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzv(this.zzf, "dialog_click", map);
        if (iVar != null) {
            iVar.zzb();
        }
    }

    public final void zzq(String str, zzdiy zzdiyVar) {
        String strZzB;
        String string = "";
        if (TextUtils.isEmpty(zzdiyVar.zzx())) {
            strZzB = zzdiyVar.zzB() != null ? zzdiyVar.zzB() : "";
        } else {
            strZzB = zzdiyVar.zzx();
        }
        zzbfy zzbfyVarZzm = zzdiyVar.zzm();
        if (zzbfyVarZzm != null) {
            try {
                string = zzbfyVarZzm.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbfy zzbfyVarZzn = zzdiyVar.zzn();
        Drawable drawable = null;
        if (zzbfyVarZzn != null) {
            try {
                q7.a aVarZzf = zzbfyVarZzn.zzf();
                if (aVarZzf != null) {
                    drawable = (Drawable) b.I(aVarZzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzedd(strZzB, string, drawable));
    }
}
