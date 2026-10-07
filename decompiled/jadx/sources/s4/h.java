package s4;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Exception f8419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8420d;

    public h(int i, Object obj, Exception exc) {
        this.f8417a = i;
        this.f8418b = obj;
        this.f8419c = exc;
    }

    public static h a(Exception exc) {
        return new h(2, null, exc);
    }

    public static h b() {
        return new h(3, null, null);
    }

    public static h c(Object obj) {
        return new h(1, obj, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        Exception exc = hVar.f8419c;
        Object obj2 = hVar.f8418b;
        if (this.f8417a != hVar.f8417a) {
            return false;
        }
        Object obj3 = this.f8418b;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
        } else if (!obj3.equals(obj2)) {
            return false;
        }
        Exception exc2 = this.f8419c;
        if (exc2 == null) {
            return exc == null;
        }
        return exc2.equals(exc);
    }

    public final int hashCode() {
        int iD = u.e.d(this.f8417a) * 31;
        Object obj = this.f8418b;
        int iHashCode = (iD + (obj == null ? 0 : obj.hashCode())) * 31;
        Exception exc = this.f8419c;
        return iHashCode + (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Resource{mState=");
        int i = this.f8417a;
        if (i == 1) {
            str = "SUCCESS";
        } else if (i != 2) {
            str = i != 3 ? "null" : "LOADING";
        } else {
            str = "FAILURE";
        }
        sb2.append(str);
        sb2.append(", mValue=");
        sb2.append(this.f8418b);
        sb2.append(", mException=");
        sb2.append(this.f8419c);
        sb2.append('}');
        return sb2.toString();
    }
}
