import { ELibraClientPage } from './app.po';

describe('e-libra-client App', () => {
  let page: ELibraClientPage;

  beforeEach(() => {
    page = new ELibraClientPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
