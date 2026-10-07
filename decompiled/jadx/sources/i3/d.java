package i3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends y1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5166a;

    @Override // y1.c
    public final void a(g2.c cVar, Object obj) {
        switch (this.f5166a) {
            case 0:
                a aVar = (a) obj;
                jc.i.e(cVar, "statement");
                jc.i.e(aVar, "entity");
                cVar.b(1, aVar.f5158a);
                break;
            case 1:
                f fVar = (f) obj;
                jc.i.e(cVar, "statement");
                jc.i.e(fVar, "entity");
                cVar.b(1, fVar.f5170a);
                break;
            case 2:
                f fVar2 = (f) obj;
                jc.i.e(cVar, "statement");
                jc.i.e(fVar2, "entity");
                long j4 = fVar2.f5170a;
                cVar.b(1, j4);
                cVar.q(2, fVar2.f5171b);
                cVar.b(3, fVar2.f5172c);
                cVar.b(4, j4);
                break;
            default:
                o oVar = (o) obj;
                jc.i.e(cVar, "statement");
                jc.i.e(oVar, "entity");
                cVar.q(1, oVar.f5191a);
                break;
        }
    }

    @Override // y1.c
    public final String b() {
        switch (this.f5166a) {
            case 0:
                return "DELETE FROM `checker_batches` WHERE `id` = ?";
            case 1:
                return "DELETE FROM `notes` WHERE `id` = ?";
            case 2:
                return "UPDATE OR ABORT `notes` SET `id` = ?,`content` = ?,`createdAt` = ? WHERE `id` = ?";
            default:
                return "DELETE FROM `notifications` WHERE `notificationId` = ?";
        }
    }
}
