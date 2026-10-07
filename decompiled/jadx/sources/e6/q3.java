package e6;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q3 extends h7.a {
    public static final Parcelable.Creator<q3> CREATOR = new r3(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3409d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3410f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q3[] f3411r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f3412s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f3413t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3414u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f3415v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f3416w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f3417x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f3418y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f3419z;

    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    public q3(Context context, w5.h[] hVarArr) {
        int i;
        int i10;
        String str;
        int dimensionPixelSize;
        w5.h hVar = hVarArr[0];
        this.f3409d = false;
        int i11 = hVar.f9656a;
        int i12 = hVar.f9657b;
        boolean z4 = i11 == -3 && i12 == -4;
        this.f3413t = z4;
        this.f3417x = false;
        boolean z10 = hVar.f9659d;
        this.f3418y = z10;
        boolean z11 = hVar.f9660f;
        this.f3419z = z11;
        if (z4) {
            w5.h hVar2 = w5.h.h;
            this.e = hVar2.f9656a;
            i12 = hVar2.f9657b;
            this.f3407b = i12;
        } else if (z10) {
            this.e = i11;
            i12 = hVar.e;
            this.f3407b = i12;
        } else if (z11) {
            this.e = i11;
            i12 = hVar.f9661g;
            this.f3407b = i12;
        } else {
            this.e = i11;
            this.f3407b = i12;
        }
        boolean z12 = this.e == -1;
        boolean z13 = i12 == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z12) {
            i6.d dVar = s.f3427f.f3428a;
            if (context.getResources().getConfiguration().orientation != 2) {
                dimensionPixelSize = displayMetrics.widthPixels;
                this.f3410f = dimensionPixelSize;
            } else {
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                if (((int) (displayMetrics2.heightPixels / displayMetrics2.density)) < 600) {
                    DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics3);
                        int i13 = displayMetrics3.heightPixels;
                        int i14 = displayMetrics3.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics3);
                        int i15 = displayMetrics3.heightPixels;
                        int i16 = displayMetrics3.widthPixels;
                        if (i15 == i13 && i16 == i14) {
                            int i17 = displayMetrics.widthPixels;
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            dimensionPixelSize = i17 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.f3410f = dimensionPixelSize;
                        } else {
                            dimensionPixelSize = displayMetrics.widthPixels;
                            this.f3410f = dimensionPixelSize;
                        }
                    } else {
                        dimensionPixelSize = displayMetrics.widthPixels;
                        this.f3410f = dimensionPixelSize;
                    }
                } else {
                    dimensionPixelSize = displayMetrics.widthPixels;
                    this.f3410f = dimensionPixelSize;
                }
            }
            double d10 = dimensionPixelSize / displayMetrics.density;
            i = (int) d10;
            if (d10 - ((double) i) >= 0.01d) {
                i++;
            }
        } else {
            i = this.e;
            i6.d dVar2 = s.f3427f.f3428a;
            this.f3410f = i6.d.l(displayMetrics, i);
        }
        if (z13) {
            int i18 = (int) (displayMetrics.heightPixels / displayMetrics.density);
            i10 = i18 <= 400 ? 32 : i18 <= 720 ? 50 : 90;
        } else {
            i10 = this.f3407b;
        }
        i6.d dVar3 = s.f3427f.f3428a;
        this.f3408c = i6.d.l(displayMetrics, i10);
        if (z12 || z13) {
            this.f3406a = i + "x" + i10 + "_as";
        } else {
            if (z10 || z11) {
                str = this.e + "x" + this.f3407b + "_as";
            } else if (z4) {
                str = "320x50_mb";
            } else {
                this.f3406a = hVar.f9658c;
            }
            this.f3406a = str;
        }
        int length = hVarArr.length;
        if (length > 1) {
            this.f3411r = new q3[length];
            for (int i19 = 0; i19 < hVarArr.length; i19++) {
                this.f3411r[i19] = new q3(context, hVarArr[i19]);
            }
        } else {
            this.f3411r = null;
        }
        this.f3412s = false;
        this.f3414u = false;
    }

    public static q3 g() {
        return new q3("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static q3 h() {
        return new q3("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 2, this.f3406a, false);
        com.bumptech.glide.d.R(parcel, 3, 4);
        parcel.writeInt(this.f3407b);
        com.bumptech.glide.d.R(parcel, 4, 4);
        parcel.writeInt(this.f3408c);
        com.bumptech.glide.d.R(parcel, 5, 4);
        parcel.writeInt(this.f3409d ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 6, 4);
        parcel.writeInt(this.e);
        com.bumptech.glide.d.R(parcel, 7, 4);
        parcel.writeInt(this.f3410f);
        com.bumptech.glide.d.N(parcel, 8, this.f3411r, i);
        com.bumptech.glide.d.R(parcel, 9, 4);
        parcel.writeInt(this.f3412s ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 10, 4);
        parcel.writeInt(this.f3413t ? 1 : 0);
        boolean z4 = this.f3414u;
        com.bumptech.glide.d.R(parcel, 11, 4);
        parcel.writeInt(z4 ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 12, 4);
        parcel.writeInt(this.f3415v ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 13, 4);
        parcel.writeInt(this.f3416w ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 14, 4);
        parcel.writeInt(this.f3417x ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 15, 4);
        parcel.writeInt(this.f3418y ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 16, 4);
        parcel.writeInt(this.f3419z ? 1 : 0);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    public q3(String str, int i, int i10, boolean z4, int i11, int i12, q3[] q3VarArr, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f3406a = str;
        this.f3407b = i;
        this.f3408c = i10;
        this.f3409d = z4;
        this.e = i11;
        this.f3410f = i12;
        this.f3411r = q3VarArr;
        this.f3412s = z10;
        this.f3413t = z11;
        this.f3414u = z12;
        this.f3415v = z13;
        this.f3416w = z14;
        this.f3417x = z15;
        this.f3418y = z16;
        this.f3419z = z17;
    }

    public q3() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public q3(Context context, w5.h hVar) {
        this(context, new w5.h[]{hVar});
    }
}
