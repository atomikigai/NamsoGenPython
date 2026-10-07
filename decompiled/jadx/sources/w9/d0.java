package w9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.p002firebaseauthapi.zzahb;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import v9.h0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends v9.n {
    public static final Parcelable.Creator<d0> CREATOR = new b(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzahb f9819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f9820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9822d;
    public List e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f9823f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f9824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f9825s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public e0 f9826t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9827u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public h0 f9828v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public m f9829w;

    public d0(zzahb zzahbVar, b0 b0Var, String str, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, Boolean bool, e0 e0Var, boolean z4, h0 h0Var, m mVar) {
        this.f9819a = zzahbVar;
        this.f9820b = b0Var;
        this.f9821c = str;
        this.f9822d = str2;
        this.e = arrayList;
        this.f9823f = arrayList2;
        this.f9824r = str3;
        this.f9825s = bool;
        this.f9826t = e0Var;
        this.f9827u = z4;
        this.f9828v = h0Var;
        this.f9829w = mVar;
    }

    @Override // v9.c0
    public final String d() {
        return this.f9820b.f9807b;
    }

    @Override // v9.n
    public final Uri h() {
        b0 b0Var = this.f9820b;
        String str = b0Var.f9809d;
        if (!TextUtils.isEmpty(str) && b0Var.e == null) {
            b0Var.e = Uri.parse(str);
        }
        return b0Var.e;
    }

    @Override // v9.n
    public final String i() {
        Map map;
        zzahb zzahbVar = this.f9819a;
        if (zzahbVar == null || zzahbVar.zze() == null || (map = (Map) k.a(zzahbVar.zze()).f9273b.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // v9.n
    public final boolean j() {
        String str;
        Boolean bool = this.f9825s;
        if (bool == null || bool.booleanValue()) {
            zzahb zzahbVar = this.f9819a;
            if (zzahbVar != null) {
                Map map = (Map) k.a(zzahbVar.zze()).f9273b.get("firebase");
                str = map != null ? (String) map.get("sign_in_provider") : null;
            } else {
                str = "";
            }
            boolean z4 = false;
            if (this.e.size() <= 1 && (str == null || !str.equals("custom"))) {
                z4 = true;
            }
            this.f9825s = Boolean.valueOf(z4);
        }
        return this.f9825s.booleanValue();
    }

    @Override // v9.n
    public final synchronized d0 l(List list) {
        try {
            i0.i(list);
            this.e = new ArrayList(list.size());
            this.f9823f = new ArrayList(list.size());
            for (int i = 0; i < list.size(); i++) {
                v9.c0 c0Var = (v9.c0) list.get(i);
                if (c0Var.d().equals("firebase")) {
                    this.f9820b = (b0) c0Var;
                } else {
                    this.f9823f.add(c0Var.d());
                }
                this.e.add((b0) c0Var);
            }
            if (this.f9820b == null) {
                this.f9820b = (b0) this.e.get(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // v9.n
    public final void m(ArrayList arrayList) {
        m mVar;
        if (arrayList.isEmpty()) {
            mVar = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                v9.s sVar = (v9.s) obj;
                if (sVar instanceof v9.x) {
                    arrayList2.add((v9.x) sVar);
                } else if (sVar instanceof v9.a0) {
                    arrayList3.add((v9.a0) sVar);
                }
            }
            mVar = new m(arrayList2, arrayList3);
        }
        this.f9829w = mVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.J(parcel, 1, this.f9819a, i, false);
        com.bumptech.glide.d.J(parcel, 2, this.f9820b, i, false);
        com.bumptech.glide.d.K(parcel, 3, this.f9821c, false);
        com.bumptech.glide.d.K(parcel, 4, this.f9822d, false);
        com.bumptech.glide.d.O(parcel, 5, this.e, false);
        com.bumptech.glide.d.M(parcel, 6, this.f9823f);
        com.bumptech.glide.d.K(parcel, 7, this.f9824r, false);
        com.bumptech.glide.d.B(parcel, 8, Boolean.valueOf(j()));
        com.bumptech.glide.d.J(parcel, 9, this.f9826t, i, false);
        boolean z4 = this.f9827u;
        com.bumptech.glide.d.R(parcel, 10, 4);
        parcel.writeInt(z4 ? 1 : 0);
        com.bumptech.glide.d.J(parcel, 11, this.f9828v, i, false);
        com.bumptech.glide.d.J(parcel, 12, this.f9829w, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    public d0(n9.g gVar, ArrayList arrayList) {
        gVar.a();
        this.f9821c = gVar.f7360b;
        this.f9822d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f9824r = "2";
        l(arrayList);
    }
}
