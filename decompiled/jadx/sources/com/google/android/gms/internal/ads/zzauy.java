package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import e6.t;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzauy implements zzaux {
    protected static volatile zzawf zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;
    protected zzavx zzr;
    private double zzs;
    private double zzt;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzu = false;
    protected boolean zzp = false;

    public zzauy(Context context) {
        try {
            zzaua.zze();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcS)).booleanValue()) {
                this.zzr = new zzavx();
            }
        } catch (Throwable unused) {
        }
    }

    private final void zzm() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        if (this.zzc.isEmpty()) {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.zzc.clear();
        }
        this.zzb = null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    private final String zzp(Context context, String str, int i, View view, Activity activity, byte[] bArr) {
        zzauw zzauwVarZzd;
        String str2;
        int i10;
        Exception exc;
        int i11;
        int i12;
        String strZzb;
        int i13;
        int i14;
        zzasf zzasfVarZzc;
        int i15;
        int i16;
        int i17 = i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcF)).booleanValue();
        zzasf zzasfVarZzb = null;
        if (zBooleanValue) {
            zzauwVarZzd = zza != null ? zza.zzd() : null;
            str2 = "be";
        } else {
            zzauwVarZzd = null;
            str2 = null;
        }
        try {
            if (i17 == 3) {
                zzasfVarZzb = zzb(context, view, activity);
                try {
                    this.zzu = true;
                    i16 = 1002;
                } catch (Exception e) {
                    exc = e;
                    i10 = 3;
                    if (zBooleanValue) {
                        if (i17 == i10) {
                            i12 = 1003;
                        } else {
                            if (i17 == 2) {
                                i12 = 1009;
                            } else {
                                i11 = 1001;
                                i17 = 1;
                            }
                            zzauwVarZzd.zzc(i11, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                        }
                        i11 = i12;
                        zzauwVarZzd.zzc(i11, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                    }
                }
            } else {
                if (i17 == 2) {
                    zzasfVarZzc = zzi(context, view, activity);
                    i15 = 1008;
                } else {
                    zzasfVarZzc = zzc(context, null);
                    i15 = zzbbs.zzq.zzf;
                }
                zzasfVarZzb = zzasfVarZzc;
                i16 = i15;
            }
            if (!zBooleanValue || zzauwVarZzd == null) {
                i10 = 3;
            } else {
                i10 = 3;
                try {
                    zzauwVarZzd.zzc(i16, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                } catch (Exception e4) {
                    e = e4;
                    exc = e;
                    if (zBooleanValue && zzauwVarZzd != null) {
                        if (i17 == i10) {
                            i12 = 1003;
                        } else {
                            if (i17 == 2) {
                                i12 = 1009;
                            } else {
                                i11 = 1001;
                                i17 = 1;
                            }
                            zzauwVarZzd.zzc(i11, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                        }
                        i11 = i12;
                        zzauwVarZzd.zzc(i11, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                    }
                }
            }
        } catch (Exception e10) {
            e = e10;
            i10 = 3;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (zzasfVarZzb != null) {
            try {
                if (((zzata) zzasfVarZzb.zzbr()).zzaY() == 0) {
                    strZzb = Integer.toString(5);
                } else {
                    zzata zzataVar = (zzata) zzasfVarZzb.zzbr();
                    int i18 = zzaua.zzc;
                    strZzb = zzaua.zzb(zzataVar.zzaV(), str);
                    if (zBooleanValue && zzauwVarZzd != null) {
                        if (i17 == i10) {
                            i13 = 1006;
                        } else {
                            i13 = i17 == 2 ? 1010 : 1004;
                        }
                        zzauwVarZzd.zzc(i13, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, null);
                    }
                }
            } catch (Exception e11) {
                strZzb = Integer.toString(7);
                if (zBooleanValue && zzauwVarZzd != null) {
                    if (i17 == i10) {
                        i14 = 1007;
                    } else {
                        i14 = i17 == 2 ? 1011 : 1005;
                    }
                    zzauwVarZzd.zzc(i14, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, e11);
                }
            }
        } else {
            strZzb = Integer.toString(5);
        }
        return strZzb;
    }

    public abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzavv;

    public abstract zzasf zzb(Context context, View view, Activity activity);

    public abstract zzasf zzc(Context context, zzars zzarsVar);

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzd(Context context, String str, View view) {
        return zzp(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zze(Context context, String str, View view, Activity activity) {
        return zzp(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzf(Context context) {
        if (zzawi.zzc()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzp(context, null, 1, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzg(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzh(Context context, View view, Activity activity) {
        return zzp(context, null, 2, view, activity, null);
    }

    public abstract zzasf zzi(Context context, View view, Activity activity);

    public abstract zzawh zzj(MotionEvent motionEvent) throws zzavv;

    @Override // com.google.android.gms.internal.ads.zzaux
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l2;
        try {
            if (this.zzu) {
                zzm();
                this.zzu = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.zzk = 0.0d;
                this.zzs = motionEvent.getRawX();
                this.zzt = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d10 = rawX - this.zzs;
                double d11 = rawY - this.zzt;
                this.zzk += Math.sqrt((d11 * d11) + (d10 * d10));
                this.zzs = rawX;
                this.zzt = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.zzb = motionEventObtain;
                        this.zzc.add(motionEventObtain);
                        if (this.zzc.size() > 6) {
                            ((MotionEvent) this.zzc.remove()).recycle();
                        }
                        this.zzf++;
                        this.zzh = zza(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.zze += (long) (motionEvent.getHistorySize() + 1);
                        zzawh zzawhVarZzj = zzj(motionEvent);
                        Long l10 = zzawhVarZzj.zzd;
                        if (l10 != null && zzawhVarZzj.zzg != null) {
                            this.zzi = l10.longValue() + zzawhVarZzj.zzg.longValue() + this.zzi;
                        }
                        if (this.zzq != null && (l2 = zzawhVarZzj.zze) != null && zzawhVarZzj.zzh != null) {
                            this.zzj = l2.longValue() + zzawhVarZzj.zzh.longValue() + this.zzj;
                        }
                    } else if (action2 == 3) {
                        this.zzg++;
                    }
                } catch (zzavv unused) {
                }
            } else {
                this.zzl = motionEvent.getX();
                this.zzm = motionEvent.getY();
                this.zzn = motionEvent.getRawX();
                this.zzo = motionEvent.getRawY();
                this.zzd++;
            }
            this.zzp = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final synchronized void zzl(int i, int i10, int i11) {
        try {
            if (this.zzb != null) {
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcD)).booleanValue()) {
                    zzm();
                } else {
                    this.zzb.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.zzq;
            if (displayMetrics != null) {
                float f10 = displayMetrics.density;
                this.zzb = MotionEvent.obtain(0L, i11, 1, i * f10, i10 * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.zzb = null;
            }
            this.zzp = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzavx zzavxVar;
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcS)).booleanValue() || (zzavxVar = this.zzr) == null) {
            return;
        }
        zzavxVar.zzb(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public void zzo(View view) {
    }
}
