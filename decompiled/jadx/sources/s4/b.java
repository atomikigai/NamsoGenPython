package s4;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r4.i f8392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f8393b;

    public b(Integer num, r4.i iVar) {
        this.f8392a = iVar;
        this.f8393b = num;
    }

    public final int hashCode() {
        r4.i iVar = this.f8392a;
        return this.f8393b.hashCode() + ((iVar == null ? 0 : iVar.hashCode()) * 31);
    }

    public final String toString() {
        return "FirebaseAuthUIAuthenticationResult{idpResponse=" + this.f8392a + ", resultCode='" + this.f8393b + '}';
    }
}
