package fd;

import java.net.Socket;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends od.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f3922m;

    public h(i iVar) {
        this.f3922m = iVar;
    }

    @Override // od.e
    public final void j() {
        Socket socket;
        i iVar = this.f3922m;
        if (iVar.f3934x) {
            return;
        }
        iVar.f3934x = true;
        e eVar = iVar.f3935y;
        if (eVar != null) {
            ((gd.d) eVar.f3914d).cancel();
        }
        k kVar = iVar.f3936z;
        if (kVar == null || (socket = kVar.f3939c) == null) {
            return;
        }
        cd.b.e(socket);
    }
}
