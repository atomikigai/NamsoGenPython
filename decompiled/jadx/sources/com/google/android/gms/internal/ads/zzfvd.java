package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfvd {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfvv zzc = new zzfvv("OverlayDisplayService");
    private static final Intent zzd = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzfvu zza;
    private final String zze;

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.zzfuz] */
    public zzfvd(Context context) {
        if (zzfvx.zza(context)) {
            this.zza = new zzfvu(context.getApplicationContext(), zzc, "OverlayDisplayService", zzd, new Object() { // from class: com.google.android.gms.internal.ads.zzfuz
            });
        } else {
            this.zza = null;
        }
        this.zze = context.getPackageName();
    }

    public static /* synthetic */ boolean zzh(String str) {
        return !zzk(str);
    }

    private static void zzi(String str, Consumer consumer) {
        if (zzk(str)) {
            return;
        }
        str.getClass();
        consumer.accept(str.trim());
    }

    private static boolean zzj(zzfvi zzfviVar, String str, List list) {
        if (list.stream().anyMatch(new Predicate() { // from class: com.google.android.gms.internal.ads.zzfva
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return zzfvd.zzh((String) obj);
            }
        })) {
            return true;
        }
        zzc.zza(str, new Object[0]);
        zzfvg zzfvgVarZzc = zzfvh.zzc();
        zzfvgVarZzc.zzb(8160);
        zzfviVar.zza(zzfvgVarZzc.zzc());
        return false;
    }

    private static boolean zzk(String str) {
        return zzfxf.zzc(str).trim().isEmpty();
    }

    public final void zza() {
        if (this.zza == null) {
            return;
        }
        zzc.zzc("unbind LMD display overlay service", new Object[0]);
        this.zza.zzn();
    }

    public final void zzb(final zzfuk zzfukVar, final zzfvi zzfviVar) {
        if (this.zza == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (zzj(zzfviVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(zzfukVar.zzb(), zzfukVar.zza()))) {
            this.zza.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfut
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc(zzfukVar, zzfviVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzc(zzfuk zzfukVar, zzfvi zzfviVar) {
        try {
            zzfvu zzfvuVar = this.zza;
            if (zzfvuVar == null) {
                throw null;
            }
            zzftu zzftuVar = (zzftu) zzfvuVar.zzc();
            if (zzftuVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            zzi(zzfukVar.zzb(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfuw
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzfvd.zzb;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            zzi(zzfukVar.zza(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfux
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzfvd.zzb;
                    bundle.putString("appId", (String) obj);
                }
            });
            zzftuVar.zze(bundle, new zzfvc(this, zzfviVar));
        } catch (RemoteException e) {
            zzc.zzb(e, "dismiss overlay display from: %s", this.zze);
        }
    }

    public final /* synthetic */ void zzd(zzfvf zzfvfVar, zzfvi zzfviVar) {
        try {
            zzfvu zzfvuVar = this.zza;
            if (zzfvuVar == null) {
                throw null;
            }
            zzftu zzftuVar = (zzftu) zzfvuVar.zzc();
            if (zzftuVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", zzfvfVar.zzf());
            zzi(zzfvfVar.zzg(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfvb
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzfvd.zzb;
                    bundle.putString("adFieldEnifd", (String) obj);
                }
            });
            bundle.putInt("layoutGravity", zzfvfVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzfvfVar.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", zzfvfVar.zze());
            zzi(null, new Consumer() { // from class: com.google.android.gms.internal.ads.zzfup
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzfvd.zzb;
                    bundle.putString("deeplinkUrl", (String) obj);
                }
            });
            zzi(null, new Consumer() { // from class: com.google.android.gms.internal.ads.zzfuq
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzfvd.zzb;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            zzi(zzfvfVar.zzh(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfur
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzfvd.zzb;
                    bundle.putString("appId", (String) obj);
                }
            });
            zzi(null, new Consumer() { // from class: com.google.android.gms.internal.ads.zzfus
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = zzfvd.zzb;
                    bundle.putString("thirdPartyAuthCallerId", (String) obj);
                }
            });
            bundle.putBoolean("stableSessionToken", true);
            zzftuVar.zzf(str, bundle, new zzfvc(this, zzfviVar));
        } catch (RemoteException e) {
            zzc.zzb(e, "show overlay display from: %s", this.zze);
        }
    }

    public final /* synthetic */ void zze(zzfvk zzfvkVar, int i, zzfvi zzfviVar) {
        try {
            zzfvu zzfvuVar = this.zza;
            if (zzfvuVar == null) {
                throw null;
            }
            zzftu zzftuVar = (zzftu) zzfvuVar.zzc();
            if (zzftuVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i);
            zzi(zzfvkVar.zzb(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfuo
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = zzfvd.zzb;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            zzi(zzfvkVar.zza(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfuu
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = zzfvd.zzb;
                    bundle.putString("appId", (String) obj);
                }
            });
            zzftuVar.zzg(bundle, new zzfvc(this, zzfviVar));
        } catch (RemoteException e) {
            zzc.zzb(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i), this.zze);
        }
    }

    public final void zzf(final zzfvf zzfvfVar, final zzfvi zzfviVar) {
        if (this.zza == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (zzj(zzfviVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, zzfvfVar.zzh()))) {
            this.zza.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfuy
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd(zzfvfVar, zzfviVar);
                }
            });
        }
    }

    public final void zzg(final zzfvk zzfvkVar, final zzfvi zzfviVar, final int i) {
        if (this.zza == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (zzj(zzfviVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(zzfvkVar.zzb(), zzfvkVar.zza()))) {
            this.zza.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfuv
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zze(zzfvkVar, i, zzfviVar);
                }
            });
        }
    }
}
