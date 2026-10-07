package r4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s4.i f8165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9.d f8166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8168d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f8169f;

    public i(g gVar) {
        this(null, null, null, false, gVar, null);
    }

    public static i a(Exception exc) {
        if (exc instanceof g) {
            return new i((g) exc);
        }
        if (exc instanceof f) {
            return ((f) exc).f8159a;
        }
        if (exc instanceof h) {
            h hVar = (h) exc;
            return new i(new s4.i(hVar.f8162b, hVar.f8163c, null, null, null), null, null, false, new g(hVar.f8161a, hVar.getMessage()), hVar.f8164d);
        }
        g gVar = new g(0, exc.getMessage());
        gVar.setStackTrace(exc.getStackTrace());
        return new i(gVar);
    }

    public static i b(Intent intent) {
        if (intent != null) {
            return (i) intent.getParcelableExtra("extra_idp_response");
        }
        return null;
    }

    public static Intent d(Exception exc) {
        return a(exc).g();
    }

    public final String c() {
        s4.i iVar = this.f8165a;
        if (iVar != null) {
            return iVar.f8422b;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        s4.i iVar = this.f8165a;
        if (iVar != null) {
            return iVar.f8421a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        v9.d dVar = iVar.f8166b;
        g gVar = iVar.f8169f;
        String str = iVar.f8168d;
        String str2 = iVar.f8167c;
        s4.i iVar2 = iVar.f8165a;
        s4.i iVar3 = this.f8165a;
        if (iVar3 == null) {
            if (iVar2 != null) {
                return false;
            }
        } else if (!iVar3.equals(iVar2)) {
            return false;
        }
        String str3 = this.f8167c;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        String str4 = this.f8168d;
        if (str4 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str4.equals(str)) {
            return false;
        }
        if (this.e != iVar.e) {
            return false;
        }
        g gVar2 = this.f8169f;
        if (gVar2 == null) {
            if (gVar != null) {
                return false;
            }
        } else if (!gVar2.equals(gVar)) {
            return false;
        }
        v9.d dVar2 = this.f8166b;
        if (dVar2 == null) {
            return dVar == null;
        }
        return dVar2.g().equals(dVar.g());
    }

    public final boolean f() {
        return this.f8169f == null;
    }

    public final Intent g() {
        return new Intent().putExtra("extra_idp_response", this);
    }

    public final int hashCode() {
        s4.i iVar = this.f8165a;
        int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        String str = this.f8167c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f8168d;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + (this.e ? 1 : 0)) * 31;
        g gVar = this.f8169f;
        int iHashCode4 = (iHashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        v9.d dVar = this.f8166b;
        return iHashCode4 + (dVar != null ? dVar.g().hashCode() : 0);
    }

    public final String toString() {
        return "IdpResponse{mUser=" + this.f8165a + ", mToken='" + this.f8167c + "', mSecret='" + this.f8168d + "', mIsNewUser='" + this.e + "', mException=" + this.f8169f + ", mPendingCredential=" + this.f8166b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws Throwable {
        g gVar = this.f8169f;
        parcel.writeParcelable(this.f8165a, i);
        parcel.writeString(this.f8167c);
        parcel.writeString(this.f8168d);
        parcel.writeInt(this.e ? 1 : 0);
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                try {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new ByteArrayOutputStream());
                    try {
                        objectOutputStream2.writeObject(gVar);
                        parcel.writeSerializable(gVar);
                        objectOutputStream2.close();
                    } catch (IOException unused) {
                        objectOutputStream = objectOutputStream2;
                        g gVar2 = new g(0, "Exception serialization error, forced wrapping. Original: " + gVar + ", original cause: " + gVar.getCause());
                        gVar2.setStackTrace(gVar.getStackTrace());
                        parcel.writeSerializable(gVar2);
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        objectOutputStream = objectOutputStream2;
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException unused3) {
            }
        } catch (IOException unused4) {
        }
        parcel.writeParcelable(this.f8166b, 0);
    }

    public i(s4.i iVar, String str, String str2, boolean z4, g gVar, v9.d dVar) {
        this.f8165a = iVar;
        this.f8167c = str;
        this.f8168d = str2;
        this.e = z4;
        this.f8169f = gVar;
        this.f8166b = dVar;
    }
}
