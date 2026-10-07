package y9;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f10647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f10648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ta.c f10649d;

    public /* synthetic */ d(f fVar, Runnable runnable, ta.c cVar, int i) {
        this.f10646a = i;
        this.f10647b = fVar;
        this.f10648c = runnable;
        this.f10649d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10646a) {
            case 0:
                ExecutorService executorService = this.f10647b.f10653a;
                final int i = 0;
                final Runnable runnable = this.f10648c;
                final ta.c cVar = this.f10649d;
                executorService.execute(new Runnable() { // from class: y9.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) cVar.f8662a).j(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e4) {
                                    ((h) cVar.f8662a).j(e4);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) cVar.f8662a;
                                try {
                                    runnable2.run();
                                    hVar.i(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.j(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f10647b.f10653a;
                final int i10 = 2;
                final Runnable runnable2 = this.f10648c;
                final ta.c cVar2 = this.f10649d;
                executorService2.execute(new Runnable() { // from class: y9.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) cVar2.f8662a).j(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e4) {
                                    ((h) cVar2.f8662a).j(e4);
                                    return;
                                }
                            default:
                                Runnable runnable3 = runnable2;
                                h hVar = (h) cVar2.f8662a;
                                try {
                                    runnable3.run();
                                    hVar.i(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.j(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f10647b.f10653a;
                final int i11 = 1;
                final Runnable runnable3 = this.f10648c;
                final ta.c cVar3 = this.f10649d;
                executorService3.execute(new Runnable() { // from class: y9.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((h) cVar3.f8662a).j(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e4) {
                                    ((h) cVar3.f8662a).j(e4);
                                    return;
                                }
                            default:
                                Runnable runnable4 = runnable3;
                                h hVar = (h) cVar3.f8662a;
                                try {
                                    runnable4.run();
                                    hVar.i(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.j(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
