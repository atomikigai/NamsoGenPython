package b6;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1407b;

    public a(String str, boolean z4) {
        this.f1406a = str;
        this.f1407b = z4;
    }

    public final String toString() {
        String str = this.f1406a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
        sb2.append("{");
        sb2.append(str);
        sb2.append("}");
        sb2.append(this.f1407b);
        return sb2.toString();
    }
}
