package i3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends y1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5165a;

    @Override // y1.c
    public final void a(g2.c cVar, Object obj) {
        switch (this.f5165a) {
            case 0:
                a aVar = (a) obj;
                jc.i.e(cVar, "statement");
                cVar.b(1, aVar.f5158a);
                cVar.q(2, aVar.f5159b);
                cVar.q(3, aVar.f5160c);
                cVar.b(4, aVar.f5161d);
                cVar.b(5, aVar.e);
                break;
            case 1:
                f fVar = (f) obj;
                jc.i.e(cVar, "statement");
                cVar.b(1, fVar.f5170a);
                cVar.q(2, fVar.f5171b);
                cVar.b(3, fVar.f5172c);
                break;
            case 2:
                o oVar = (o) obj;
                jc.i.e(cVar, "statement");
                cVar.q(1, oVar.f5191a);
                cVar.q(2, oVar.f5192b);
                cVar.q(3, oVar.f5193c);
                String str = oVar.f5194d;
                if (str == null) {
                    cVar.n();
                } else {
                    cVar.q(4, str);
                }
                cVar.b(5, oVar.e);
                break;
            default:
                q qVar = (q) obj;
                jc.i.e(cVar, "statement");
                cVar.q(1, qVar.f5196a);
                cVar.b(2, qVar.f5197b);
                break;
        }
    }

    @Override // y1.c
    public final String b() {
        switch (this.f5165a) {
            case 0:
                return "INSERT OR ABORT INTO `checker_batches` (`id`,`gate`,`content`,`total`,`createdAt`) VALUES (nullif(?, 0),?,?,?,?)";
            case 1:
                return "INSERT OR ABORT INTO `notes` (`id`,`content`,`createdAt`) VALUES (nullif(?, 0),?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `notifications` (`notificationId`,`title`,`body`,`url`,`receivedAt`) VALUES (?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `temp_mail_history` (`email`,`createdAt`) VALUES (?,?)";
        }
    }
}
